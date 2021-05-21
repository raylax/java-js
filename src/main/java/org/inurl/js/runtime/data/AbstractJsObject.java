package org.inurl.js.runtime.data;

import java.util.function.Function;

/**
 * @author raylax
 */
public abstract class AbstractJsObject<T> {

    private final JsDataType type;
    protected T value;
    protected AbstractJsObject<?> defaultValue = JsObject.UNDEFINED;

    protected AbstractJsObject(JsDataType type) {
        this.type = type;
    }

    public AbstractJsObject<T> withDefault(AbstractJsObject<?> defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public AbstractJsObject<?> getDefaultValue() {
        return defaultValue;
    }

    public boolean isNull() {
        return this.type == JsDataType.NULL || value == null;
    }

    public boolean isUndefined() {
        return is(JsDataType.UNDEFINED);
    }

    public boolean isFunction() {
        return is(JsDataType.FUNCTION);
    }


    public void setValue(Function<T, T> function) {
        this.value = function.apply(this.value);
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }


    public AbstractJsObject<?> copy() {
        return this;
    }


    public String display() {
        return String.valueOf(getValue());
    }

    /* IS START */
    public boolean isNumber() {
        return is(JsDataType.NUMBER);
    }
    public boolean isString() {
        return is(JsDataType.STRING);
    }
    public boolean isBoolean() {
        return is(JsDataType.BOOLEAN);
    }
    public boolean isObject() {
        return is(JsDataType.OBJECT);
    }
    public boolean isCtrl() {
        return is(JsDataType.CTRL);
    }
    /* IS END */


    /* CAST START */
    public JsNumber asNumber() {
        if (isNumber()) {
            return (JsNumber) this;
        }
        return TypeUtils.parseNumber(this);
    }
    public JsString asString() {
        return (JsString) this;
    }
    public JsFunction asFunction() {
        return (JsFunction) this;
    }
    public JsArray asArray() {
        return (JsArray) this;
    }
    public JsBoolean asBoolean() {
        return (JsBoolean) this;
    }
    public JsObject asObject() {
        return (JsObject) this;
    }
    public JsControl asCtrl() {
        return (JsControl) this;
    }
    /* CAST END */

    /* OVERRIDE */
    @Override
    public String toString() {
        return display();
    }

    private boolean is(JsDataType type) {
        return this.type == type;
    }

    public JsDataType getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractJsObject<?>)) {
            return false;
        }
        final AbstractJsObject<?> other = (AbstractJsObject<?>) o;
        if (this.isNull() && other.isNull()) {
            return true;
        }
        return this.value.equals(other.value);
    }

}
