package org.inurl.js.runtime.data;

import static org.inurl.js.runtime.data.JsDataType.CTRL;

/**
 * @author raylax
 */
public class JsControl extends AbstractJsObject<AbstractJsObject<?>> {

    private static final int STATE_MASK_CONTINUE = 0x01;
    private static final int STATE_MASK_BREAK = 0x02;
    private static final int STATE_MASK_RETURN = 0x04;

    private static final JsControl CONTINUE = new JsControl(STATE_MASK_CONTINUE);
    private static final JsControl BREAK = new JsControl(STATE_MASK_BREAK);

    private final int state;

    protected JsControl(AbstractJsObject<?> value, int state) {
        super(CTRL);
        this.value = value;
        this.state = state;
    }

    protected JsControl(int state) {
        this(null, state);
    }

    public static JsControl doContinue() {
        return CONTINUE;
    }

    public static JsControl doBreak() {
        return BREAK;
    }

    public static JsControl doReturn(AbstractJsObject<?> value) {
        return new JsControl(value, STATE_MASK_RETURN);
    }

    public boolean isContinue() {
        return is(STATE_MASK_CONTINUE);
    }

    public boolean isBreak() {
        return is(STATE_MASK_BREAK);
    }

    public boolean isReturn() {
        return is(STATE_MASK_RETURN);
    }

    private boolean is(int mask) {
        return (this.state & mask) != 0;
    }

}
