package org.inurl.js.runtime.data;

/**
 * @author raylax
 */
public class JsBoolean extends AbstractJsObject<Boolean> {

    public static final JsBoolean TRUE = new JsBoolean(true);

    public static final JsBoolean FALSE = new JsBoolean(false);

    private JsBoolean(boolean value) {
        super(JsDataType.BOOLEAN);
        this.value = value;
    }

    public JsBoolean and(JsBoolean other) {
        return new JsBoolean(this.value && other.value);
    }

    public JsBoolean or(JsBoolean other) {
        return new JsBoolean(this.value || other.value);
    }

    public JsBoolean not() {
        return new JsBoolean(!this.value);
    }

    @Override
    public JsNumber asNumber() {
        return new JsNumber(value ? 1 : 0);
    }
}
