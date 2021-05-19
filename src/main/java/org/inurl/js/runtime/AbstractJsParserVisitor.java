package org.inurl.js.runtime;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.inurl.js.lexer.JsParser;
import org.inurl.js.lexer.JsParserVisitor;
import org.inurl.js.runtime.data.AbstractJsObject;

/**
 * @author raylax
 */
public abstract class AbstractJsParserVisitor extends AbstractParseTreeVisitor<AbstractJsObject<?>> implements JsParserVisitor<AbstractJsObject<?>> {

    @Override
    public AbstractJsObject<?> visitProgram(JsParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitSourceElement(JsParser.SourceElementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitStatement(JsParser.StatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBlock(JsParser.BlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitStatementList(JsParser.StatementListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitImportStatement(JsParser.ImportStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitImportFromBlock(JsParser.ImportFromBlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitModuleItems(JsParser.ModuleItemsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitImportDefault(JsParser.ImportDefaultContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitImportNamespace(JsParser.ImportNamespaceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitImportFrom(JsParser.ImportFromContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAliasName(JsParser.AliasNameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitExportDeclaration(JsParser.ExportDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitExportDefaultDeclaration(JsParser.ExportDefaultDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitExportFromBlock(JsParser.ExportFromBlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitDeclaration(JsParser.DeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitVariableStatement(JsParser.VariableStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitVariableDeclarationList(JsParser.VariableDeclarationListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitVariableDeclaration(JsParser.VariableDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitEmptyStatement(JsParser.EmptyStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitExpressionStatement(JsParser.ExpressionStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitIfStatement(JsParser.IfStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitDoStatement(JsParser.DoStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitWhileStatement(JsParser.WhileStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitForStatement(JsParser.ForStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitForInStatement(JsParser.ForInStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitForOfStatement(JsParser.ForOfStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitVarModifier(JsParser.VarModifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitContinueStatement(JsParser.ContinueStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBreakStatement(JsParser.BreakStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitReturnStatement(JsParser.ReturnStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitYieldStatement(JsParser.YieldStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitWithStatement(JsParser.WithStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitSwitchStatement(JsParser.SwitchStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitCaseBlock(JsParser.CaseBlockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitCaseClauses(JsParser.CaseClausesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitCaseClause(JsParser.CaseClauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitDefaultClause(JsParser.DefaultClauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLabelledStatement(JsParser.LabelledStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitThrowStatement(JsParser.ThrowStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitTryStatement(JsParser.TryStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitCatchProduction(JsParser.CatchProductionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFinallyProduction(JsParser.FinallyProductionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitDebuggerStatement(JsParser.DebuggerStatementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFunctionDeclaration(JsParser.FunctionDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitClassDeclaration(JsParser.ClassDeclarationContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitClassTail(JsParser.ClassTailContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitClassElement(JsParser.ClassElementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitMethodDefinition(JsParser.MethodDefinitionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFormalParameterList(JsParser.FormalParameterListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFormalParameterArg(JsParser.FormalParameterArgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLastFormalParameterArg(JsParser.LastFormalParameterArgContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFunctionBody(JsParser.FunctionBodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitSourceElements(JsParser.SourceElementsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArrayLiteral(JsParser.ArrayLiteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitElementList(JsParser.ElementListContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArrayElement(JsParser.ArrayElementContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPropertyExpressionAssignment(JsParser.PropertyExpressionAssignmentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitComputedPropertyExpressionAssignment(JsParser.ComputedPropertyExpressionAssignmentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFunctionProperty(JsParser.FunctionPropertyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPropertyGetter(JsParser.PropertyGetterContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPropertySetter(JsParser.PropertySetterContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPropertyShorthand(JsParser.PropertyShorthandContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPropertyName(JsParser.PropertyNameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArguments(JsParser.ArgumentsContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArgument(JsParser.ArgumentContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitExpressionSequence(JsParser.ExpressionSequenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitTemplateStringExpression(JsParser.TemplateStringExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitTernaryExpression(JsParser.TernaryExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLogicalAndExpression(JsParser.LogicalAndExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPowerExpression(JsParser.PowerExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPreIncrementExpression(JsParser.PreIncrementExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitObjectLiteralExpression(JsParser.ObjectLiteralExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitMetaExpression(JsParser.MetaExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitInExpression(JsParser.InExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLogicalOrExpression(JsParser.LogicalOrExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitNotExpression(JsParser.NotExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPreDecreaseExpression(JsParser.PreDecreaseExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArgumentsExpression(JsParser.ArgumentsExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAwaitExpression(JsParser.AwaitExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitThisExpression(JsParser.ThisExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFunctionExpression(JsParser.FunctionExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitUnaryMinusExpression(JsParser.UnaryMinusExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAssignmentExpression(JsParser.AssignmentExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPostDecreaseExpression(JsParser.PostDecreaseExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitTypeofExpression(JsParser.TypeofExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitInstanceofExpression(JsParser.InstanceofExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitUnaryPlusExpression(JsParser.UnaryPlusExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitDeleteExpression(JsParser.DeleteExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitImportExpression(JsParser.ImportExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitEqualityExpression(JsParser.EqualityExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBitXOrExpression(JsParser.BitXOrExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitSuperExpression(JsParser.SuperExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitMultiplicativeExpression(JsParser.MultiplicativeExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBitShiftExpression(JsParser.BitShiftExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitParenthesizedExpression(JsParser.ParenthesizedExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAdditiveExpression(JsParser.AdditiveExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitRelationalExpression(JsParser.RelationalExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitPostIncrementExpression(JsParser.PostIncrementExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitYieldExpression(JsParser.YieldExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBitNotExpression(JsParser.BitNotExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitNewExpression(JsParser.NewExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLiteralExpression(JsParser.LiteralExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArrayLiteralExpression(JsParser.ArrayLiteralExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitMemberDotExpression(JsParser.MemberDotExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitClassExpression(JsParser.ClassExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitMemberIndexExpression(JsParser.MemberIndexExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitIdentifierExpression(JsParser.IdentifierExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBitAndExpression(JsParser.BitAndExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBitOrExpression(JsParser.BitOrExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAssignmentOperatorExpression(JsParser.AssignmentOperatorExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitVoidExpression(JsParser.VoidExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitCoalesceExpression(JsParser.CoalesceExpressionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAssignable(JsParser.AssignableContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitObjectLiteral(JsParser.ObjectLiteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitFunctionDecl(JsParser.FunctionDeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAnonymousFunctionDecl(JsParser.AnonymousFunctionDeclContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArrowFunction(JsParser.ArrowFunctionContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArrowFunctionParameters(JsParser.ArrowFunctionParametersContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitArrowFunctionBody(JsParser.ArrowFunctionBodyContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitAssignmentOperator(JsParser.AssignmentOperatorContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLiteral(JsParser.LiteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitNumericLiteral(JsParser.NumericLiteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitBigintLiteral(JsParser.BigintLiteralContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitGetter(JsParser.GetterContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitSetter(JsParser.SetterContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitIdentifierName(JsParser.IdentifierNameContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitIdentifier(JsParser.IdentifierContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitReservedWord(JsParser.ReservedWordContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitKeyword(JsParser.KeywordContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitLet_(JsParser.Let_Context ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AbstractJsObject<?> visitEos(JsParser.EosContext ctx) {
        return visitChildren(ctx);
    }


}
