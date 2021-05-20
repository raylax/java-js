package org.inurl.js.runtime.data;

import static org.inurl.js.runtime.data.JsDataType.CTRL;

/**
 * @author raylax
 */
public class JsControl extends AbstractJsObject<Object> {

    protected JsControl() {
        super(CTRL);
    }

    public static final JsControl CONTINUE = new JsControl();
    public static final JsControl BREAK = new JsControl();

}
