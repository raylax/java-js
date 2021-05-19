package org.inurl.js.runtime.data;

import java.util.Arrays;

import static org.inurl.js.runtime.data.JsBoolean.FALSE;
import static org.inurl.js.runtime.data.JsBoolean.TRUE;

/**
 * @author raylax
 */
public class TypeUtils {

    public static boolean anyString(AbstractJsObject<?>... objects) {
        return Arrays.stream(objects).anyMatch(AbstractJsObject::isString);
    }

    public static boolean allNumber(AbstractJsObject<?>... objects) {
        return Arrays.stream(objects).allMatch(o -> o.isNumber() || o.isNull() || o.isUndefined());
    }

    public static JsNumber parseNumber(AbstractJsObject<?> object) {
        try {
            return new JsNumber(Double.parseDouble(object.toString()));
        } catch (NumberFormatException ignored) {}
        return new JsNumber(0);
    }

    public static JsBoolean wrapBoolean(boolean value) {
        return value ? TRUE : FALSE;
    }

    public static JsBoolean wrapBoolean(String value) {
        return wrapBoolean(Boolean.parseBoolean(value));
    }

}
