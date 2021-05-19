package org.inurl.js.runtime.data;

/**
 * @author raylax
 */
public class JsString extends AbstractJsObject<String> {

    public JsString(String value) {
        super(JsDataType.STRING);
        this.value = value;
    }

    @Override
    public String display() {
        return "\"" + this.value + "\"";
    }

    @Override
    public String toString() {
        return this.value;
    }
}
