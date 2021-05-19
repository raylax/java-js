package org.inurl.js.runtime.data;

/**
 * @author raylax
 */
public class JsObject extends JsFunction {

    @SuppressWarnings("rawtypes")
    public static final AbstractJsObject NULL = new AbstractJsObject(JsDataType.NULL) {
        @Override
        public String display() {
            return "null";
        }

        @Override
        public JsNumber asNumber() {
            return new JsNumber(0);
        }
    };

    @SuppressWarnings("rawtypes")
    public static final AbstractJsObject UNDEFINED = new AbstractJsObject(JsDataType.UNDEFINED) {
        @Override
        public String display() {
            return "undefined";
        }

        @Override
        public JsNumber asNumber() {
            return JsNumber.NAN;
        }
    };

    protected JsObject(Object value) {
        super(JsDataType.OBJECT);
        this.value = value;
    }

    @Override
    public String display() {
        return "object";
    }
}
