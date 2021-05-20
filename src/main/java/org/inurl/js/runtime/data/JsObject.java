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

    public JsObject() {
        super(JsDataType.OBJECT);
    }

    public JsObject(Object name, AbstractJsObject<?> value) {
        this();
        setVariable(name, value);
    }

    @Override
    public String display() {
        return "object";
    }

    @Override
    public String toString() {
        return "[object Object]";
    }
}
