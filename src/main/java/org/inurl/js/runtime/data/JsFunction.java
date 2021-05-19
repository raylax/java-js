package org.inurl.js.runtime.data;

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
public class JsFunction extends AbstractJsObject<Object> implements DataHolder {

    private final Map<String, AbstractJsObject<?>> data = new HashMap<>();

    public JsFunction() {
        this(JsDataType.FUNCTION);
    }

    protected JsFunction(JsDataType type) {
        super(type);
        initMethods();
    }

    public AbstractJsObject<?> call(List<AbstractJsObject<?>> arguments) {
        throw new UnsupportedOperationException();
    }

    protected void initMethods() {
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
