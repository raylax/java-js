package org.inurl.js.runtime.data;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.inurl.js.runtime.builtin.Function;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author raylax
 */
public abstract class JsFunction extends AbstractJsObject<Object> implements DataHolder {

    private final Map<String, AbstractJsObject<?>> data = new HashMap<>();
    private JsArray parameters = JsArray.EMPTY;

    JsFunction() {
        this(JsDataType.FUNCTION);
    }

    protected JsFunction(JsDataType type) {
        super(type);
    }

    public AbstractJsObject<?> call(List<AbstractJsObject<?>> arguments) {
        throw new UnsupportedOperationException();
    }

    public static class NativeFunction extends JsFunction {
        public NativeFunction() {
            super();
            initMethods();
        }
        private void initMethods() {
            final Method[] methods = this.getClass().getDeclaredMethods();
            final JsFunction that = this;
            for (Method method : methods) {
                final int modifiers = method.getModifiers();
                if (!Modifier.isPublic(modifiers)
                        || Modifier.isStatic(modifiers)
                        || !method.isAnnotationPresent(Function.class)) {
                    continue;
                }
                final String name = method.getName();
                final JsFunction function = new JsFunction() {
                    @Override
                    public AbstractJsObject<?> call(List<AbstractJsObject<?>> arguments) {
                        try {
                            final Object result = method.invoke(that, arguments);
                            if (method.getReturnType() == Void.class) {
                                return JsObject.UNDEFINED;
                            }
                            return new JsObject(result);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            throw new RuntimeException(e);
                        }
                    }
                };
                setVariable(name, function);
            }
        }
    }

    public static class RuntimeFunction extends JsFunction {
        private final ParseTree tree;
        private final ParseTreeVisitor<AbstractJsObject<?>> visitor;
        public RuntimeFunction(ParseTreeVisitor<AbstractJsObject<?>> visitor, ParseTree tree) {
            this.visitor = visitor;
            this.tree = tree;
        }

        @Override
        public AbstractJsObject<?> call(List<AbstractJsObject<?>> arguments) {
            return visitor.visit(tree);
        }

        @Override
        public boolean isNative() {
            return false;
        }
    }

    public boolean isNative() {
        return true;
    }

    public void setParameters(JsArray parameters) {
        this.parameters = parameters;
    }

    public JsArray getParameters() {
        return parameters;
    }

    @Override
    public String display() {
        return "function";
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public boolean isUndefined() {
        return false;
    }


    @Override
    public void setVariable(String name, AbstractJsObject<?> value) {
        data.put(name, value);
    }

    @Override
    public Optional<AbstractJsObject<?>> getVariable(String name) {
        return Optional.ofNullable(data.get(name));
    }

}
