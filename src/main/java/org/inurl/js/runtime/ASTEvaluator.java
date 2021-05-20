package org.inurl.js.runtime;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenSource;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.inurl.js.runtime.builtin.Console;
import org.inurl.js.runtime.data.AbstractJsObject;
import org.inurl.js.runtime.data.JsArray;
import org.inurl.js.runtime.data.JsFunction;
import org.inurl.js.runtime.data.JsNumber;
import org.inurl.js.runtime.data.JsObject;
import org.inurl.js.runtime.data.JsString;
import org.inurl.js.runtime.data.TypeUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Stack;

import static org.inurl.js.lexer.JsParser.*;
import static org.inurl.js.runtime.data.JsObject.UNDEFINED;

/**
 * @author raylax
 */
public class ASTEvaluator extends AbstractJsParserVisitor {

    private static final RuntimeException UNREACHABLE_CODE_EXCEPTION = new IllegalStateException("unreachable code");

    private final Stack<StackFrame> stack = new Stack<>();
    private StackFrame frame = null;

    @Override
    public AbstractJsObject<?> visitProgram(ProgramContext ctx) {
        initStack();
        return super.visitProgram(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBlock(BlockContext ctx) {
        pushStack();
        final AbstractJsObject<?> result = super.visitBlock(ctx);
        popStack();
        return result;
    }

    @Override
    public AbstractJsObject<?> visitVariableDeclarationList(VariableDeclarationListContext ctx) {
        for (VariableDeclarationContext variableDeclarationContext : ctx.variableDeclaration()) {
            visitVariableDeclaration(variableDeclarationContext);
        }
        return UNDEFINED;
    }

    @Override
    public AbstractJsObject<?> visitAssignmentExpression(AssignmentExpressionContext ctx) {
        final String name = ctx.singleExpression(0).getText();
        AbstractJsObject<?> value = visit(ctx.singleExpression(1));
        frame.setVariable(name, value);
        return value;
    }

    @Override
    public AbstractJsObject<?> visitVariableDeclaration(VariableDeclarationContext ctx) {
        final String name = ctx.assignable().getText();
        final SingleExpressionContext singleExpressionContext = ctx.singleExpression();
        AbstractJsObject<?> value = UNDEFINED;
        if (singleExpressionContext != null) {
            value = visit(singleExpressionContext);
        }
        frame.letVariable(name, value);
        return UNDEFINED;
    }

    @Override
    public AbstractJsObject<?> visitNumericLiteral(NumericLiteralContext ctx) {
        // 十进制
        final TerminalNode decimalLiteral = ctx.DecimalLiteral();
        if (is(decimalLiteral)) {
            return new JsNumber(Double.parseDouble(decimalLiteral.getText()));
        }
        // 十六进制
        final TerminalNode hexIntegerLiteral = ctx.HexIntegerLiteral();
        if (is(hexIntegerLiteral)) {
            return new JsNumber(parseInt(hexIntegerLiteral, true, 16));
        }
        // 八进制
        final TerminalNode octalIntegerLiteral = ctx.OctalIntegerLiteral();
        if (is(octalIntegerLiteral)) {
            return new JsNumber(parseInt(octalIntegerLiteral, false, 8));
        }
        final TerminalNode octalIntegerLiteral2 = ctx.OctalIntegerLiteral2();
        if (is(octalIntegerLiteral2)) {
            return new JsNumber(parseInt(octalIntegerLiteral2, true, 8));
        }
        // 二进制
        final TerminalNode binaryIntegerLiteral = ctx.BinaryIntegerLiteral();
        if (is(binaryIntegerLiteral)) {
            return new JsNumber(parseInt(binaryIntegerLiteral, true, 2));
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitLiteral(LiteralContext ctx) {
        if (is(ctx.NullLiteral())) {
            return JsObject.NULL;
        }
        if (is(ctx.BooleanLiteral())) {
            return TypeUtils.wrapBoolean(ctx.getText());
        }
        if (is(ctx.StringLiteral())) {
            final String text = ctx.getText();
            return new JsString(text.substring(1, text.length() - 1));
        }
        if (is(ctx.TemplateStringLiteral())) {
            UNIMPLEMENTED("TemplateStringLiteral");
        }
        if (is(ctx.RegularExpressionLiteral())) {
            UNIMPLEMENTED("RegularExpressionLiteral");
        }
        if (is(ctx.numericLiteral())) {
            return visitNumericLiteral(ctx.numericLiteral());
        }
        if (is(ctx.bigintLiteral())) {
            UNIMPLEMENTED("bigintLiteral");
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitMultiplicativeExpression(MultiplicativeExpressionContext ctx) {
        final BinaryExpressionResult result = visitBinaryExpression(ctx.singleExpression());
        final JsNumber left = result.left.asNumber();
        final JsNumber right = result.right.asNumber();
        if (is(ctx.Multiply())) {
            return left.multiply(right);
        }
        if (is(ctx.Divide())) {
            return left.divide(right);
        }
        if (is(ctx.Modulus())) {
            return left.modulus(right);
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitRelationalExpression(RelationalExpressionContext ctx) {
        final BinaryExpressionResult result = visitBinaryExpression(ctx.singleExpression());
        final JsNumber left = result.left.asNumber();
        final JsNumber right = result.right.asNumber();
        if (is(ctx.LessThan())) {
            return left.lessThan(right);
        }
        if (is(ctx.MoreThan())) {
            return left.greaterThan(right);
        }
        if (is(ctx.LessThanEquals())) {
            return left.lessThanEquals(right);
        }
        if (is(ctx.GreaterThanEquals())) {
            return left.greaterThanEquals(right);
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitAdditiveExpression(AdditiveExpressionContext ctx) {
        final BinaryExpressionResult result = visitBinaryExpression(ctx.singleExpression());
        if (is(ctx.Plus())) {
            if (TypeUtils.allNumber(result.left, result.right)) {
                return result.left.asNumber().plus(result.right.asNumber());
            }
            return new JsString(result.left.toString() + result.right.toString());
        }
        if (is(ctx.Minus())) {
            return result.left.asNumber().minus(result.right.asNumber());
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitEqualityExpression(EqualityExpressionContext ctx) {
        final BinaryExpressionResult result = visitBinaryExpression(ctx.singleExpression());
        final boolean v = result.left.equals(result.right);
        if (is(ctx.Equals_()) || is(ctx.IdentityEquals())) {
            return TypeUtils.wrapBoolean(v);
        }
        if (is(ctx.NotEquals()) || is(ctx.IdentityNotEquals())) {
            return TypeUtils.wrapBoolean(!v);
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitIdentifier(IdentifierContext ctx) {
        if (is(ctx.Identifier())) {
            final String name = ctx.getText();
            final Optional<AbstractJsObject<?>> result = frame.getVariable(name);
            return result.orElseThrow(() -> makeException(ctx, String.format("%s is not defined", name)));
        }
        if (is(ctx.NonStrictLet())) {
            UNIMPLEMENTED("NonStrictLet");
        }
        if (is((ctx.Async()))) {
            UNIMPLEMENTED("Async");
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitMemberDotExpression(MemberDotExpressionContext ctx) {
        final AbstractJsObject<?> left = visit(ctx.singleExpression());
        final String name = ctx.identifierName().getText();
        if (left.isNull()) {
            throw makeException(ctx, String.format("Cannot read property '%s' of null", name));
        }
        if (left.isUndefined()) {
            throw makeException(ctx, String.format("Cannot read property '%s' of undefined", name));
        }
        final Optional<AbstractJsObject<?>> member = left.asFunction().getVariable(name);
        return member.orElseThrow(() -> makeException(ctx, String.format("Cannot found property '%s'", name)));
    }

    @Override
    public AbstractJsObject<?> visitArgumentsExpression(ArgumentsExpressionContext ctx) {
        final AbstractJsObject<?> left = visit(ctx.singleExpression());
        if (!left.isFunction()) {
            throw makeException(ctx, "Not is callable");
        }
        final AbstractJsObject<?> arguments = visit(ctx.arguments());
        final JsFunction function = left.asFunction();
        final AbstractJsObject<?> result;
        final List<AbstractJsObject<?>> parameters = arguments.asArray().getValue();
        final int count = parameters.size();
        if (!function.isNative()) {
            pushStack();
            final List<AbstractJsObject<?>> parameterNames = function.getParameters().getValue();
            for (int i = 0; i < parameterNames.size(); i++) {
                final JsString parameterName = parameterNames.get(i).asString();
                AbstractJsObject<?> value;
                if ((i > (count - 1)) || (value = parameters.get(i)).isUndefined()) {
                    value = parameterName.getDefaultValue();
                }
                frame.setVariable(parameterName.getValue(), value);
            }
            result = function.call(null);
            popStack();
        } else {
            result = function.call(parameters);
        }
        return result;
    }

    @Override
    public AbstractJsObject<?> visitArguments(ArgumentsContext ctx) {
        final List<ArgumentContext> arguments = ctx.argument();
        List<AbstractJsObject<?>> value = new ArrayList<>(arguments.size());
        for (ArgumentContext argument : arguments) {
            value.add(visit(argument));
        }
        return new JsArray(value);
    }

    @Override
    public AbstractJsObject<?> visitArrayLiteral(ArrayLiteralContext ctx) {
        return visit(ctx.elementList());
    }

    @Override
    public AbstractJsObject<?> visitElementList(ElementListContext ctx) {
        final List<ArrayElementContext> elements = ctx.arrayElement();
        List<AbstractJsObject<?>> value = new ArrayList<>(elements.size());
        for (ArrayElementContext elementContext : elements) {
            value.add(visit(elementContext));
        }
        return new JsArray(value);
    }

    @Override
    public AbstractJsObject<?> visitAnonymousFunctionDecl(AnonymousFunctionDeclContext ctx) {
        final JsFunction function = visit(ctx.functionBody()).asFunction();
        function.setParameters(visit(ctx.formalParameterList()).asArray());
        return function;
    }

    @Override
    public AbstractJsObject<?> visitFormalParameterList(FormalParameterListContext ctx) {
        if (ctx == null) {
            return new JsArray(Collections.emptyList());
        }
        final List<FormalParameterArgContext> parameters = ctx.formalParameterArg();
        List<AbstractJsObject<?>> value = new ArrayList<>(parameters.size());
        for (FormalParameterArgContext parameterArgContext : parameters) {
            value.add(visit(parameterArgContext));
        }
        return new JsArray(value);
    }

    @Override
    public AbstractJsObject<?> visitFormalParameterArg(FormalParameterArgContext ctx) {
        final AssignableContext assignable = ctx.assignable();
        AbstractJsObject<?> defaultValue = null;
        if (is(ctx.Assign())) {
            defaultValue = visit(ctx.singleExpression());
        }
        if (is(assignable.identifier())) {
            return new JsString(assignable.getText()).withDefault(defaultValue);
        }
        if (is(assignable.arrayLiteral())) {
            UNIMPLEMENTED("arrayLiteral");
        }
        if (is(assignable.objectLiteral())) {
            UNIMPLEMENTED("objectLiteral");
        }
        throw UNREACHABLE_CODE();
    }

    @Override
    public AbstractJsObject<?> visitFunctionBody(FunctionBodyContext ctx) {
        return new JsFunction.RuntimeFunction(this, ctx.sourceElements());
    }

    @Override
    public AbstractJsObject<?> visitFunctionDeclaration(FunctionDeclarationContext ctx) {
        final JsFunction function = visit(ctx.functionBody()).asFunction();
        function.setParameters(visit(ctx.formalParameterList()).asArray());
        final String name = ctx.identifier().getText();
        function.setName(name);
        frame.setVariable(name, function);
        return function;
    }

    @Override
    public AbstractJsObject<?> visitArrowFunction(ArrowFunctionContext ctx) {
        final JsFunction function = visit(ctx.arrowFunctionBody()).asFunction();
        final ArrowFunctionParametersContext parametersContext = ctx.arrowFunctionParameters();
        final IdentifierContext identifier = parametersContext.identifier();
        if (is(identifier)) {
            final List<JsString> parameters = Collections.singletonList(new JsString(identifier.getText()));
            function.setParameters(new JsArray(parameters));
        }
        final FormalParameterListContext parameterListContext = parametersContext.formalParameterList();
        if (is(parameterListContext)) {
            function.setParameters(visit(parameterListContext).asArray());
        }
        return function;
    }

    @Override
    public AbstractJsObject<?> visitArrowFunctionBody(ArrowFunctionBodyContext ctx) {
        if (is(ctx.singleExpression())) {
            return new JsFunction.RuntimeFunction(this, ctx.singleExpression());
        }
        if (is(ctx.functionBody())) {
            return visit(ctx.functionBody());
        }
        throw UNREACHABLE_CODE();
    }

    private RuntimeException makeException(ParserRuleContext ctx, String message) {
        final TokenSource source = ctx.getStart().getTokenSource();
        return new IllegalStateException(String.format("%s:%d %s", source.getSourceName(), source.getLine(), message));
    }

    private void initStack() {
        pushStack();
        // builtin object
        frame.setVariable("console", new Console());
    }

    private void pushStack() {
        frame = new StackFrame(frame);
        stack.push(frame);
    }

    private void popStack() {
        stack.pop();
        frame = stack.peek();
    }

    private boolean is(Object value) {
        return value != null;
    }

    private BinaryExpressionResult visitBinaryExpression(List<SingleExpressionContext> singleExpression) {
        return new BinaryExpressionResult(visit(singleExpression.get(0)), visit(singleExpression.get(1)));
    }

    private static double parseInt(TerminalNode node, boolean prefix, int radix) {
        final String text = node.getText();
        return Integer.parseInt(prefix ? text.substring(2) : text, radix);
    }

    private static class BinaryExpressionResult {
        private final AbstractJsObject<?> left;
        private final AbstractJsObject<?> right;
        private BinaryExpressionResult(AbstractJsObject<?> left, AbstractJsObject<?> right) {
            this.left = left;
            this.right = right;
        }
    }
    
    private static RuntimeException UNREACHABLE_CODE() {
        return UNREACHABLE_CODE_EXCEPTION;
    }

    private static void UNIMPLEMENTED(String message) {
        throw new IllegalStateException(message);
    }

}
