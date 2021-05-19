package org.inurl.js.runtime.data;

/**
 * @author raylax
 */
public enum JsDataType {

    STRING("string"),
    NUMBER("number"),
    BOOLEAN("boolean"),
    NULL("null"),
    UNDEFINED("undefined"),
    SYMBOL("symbol"),
    //---
    OBJECT("object"),
    ARRAY("array"),
    FUNCTION("function"),
    ;

    private final String desc;

    JsDataType(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

}
