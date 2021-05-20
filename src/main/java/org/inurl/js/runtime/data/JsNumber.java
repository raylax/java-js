package org.inurl.js.runtime.data;

import javax.annotation.Nonnull;
import java.text.DecimalFormat;

/**
 * @author raylax
 */
public class JsNumber extends AbstractJsObject<Double> {

    public static final JsNumber NAN = new JsNumber(Double.NaN) {
        @Override
        public void setValue(Double value) {
            throw new UnsupportedOperationException();
        }
    };

    private static final DecimalFormat FORMAT = new DecimalFormat("#.##");

    public JsNumber(double value) {
        super(JsDataType.NUMBER);
        this.value = value;
    }

    public boolean isNan() {
        return Double.isNaN(getValue());
    }

    public boolean isNan(@Nonnull JsNumber other) {
        return this.isNan() || other.isNan();
    }

    /**
     * +
     */
    public JsNumber plus(@Nonnull JsNumber other) {
        if (isNan(other)) {
            return NAN;
        }
        return new JsNumber(this.value + other.value);
    }

    /**
     * -
     */
    public JsNumber minus(@Nonnull JsNumber other) {
        if (isNan(other)) {
            return NAN;
        }
        return new JsNumber(this.value - other.value);
    }

    /**
     * *
     */
    public JsNumber multiply(@Nonnull JsNumber other) {
        if (isNan(other)) {
            return NAN;
        }
        return new JsNumber(this.value * other.value);
    }

    /**
     * /
     */
    public JsNumber divide(@Nonnull JsNumber other) {
        if (isNan(other)) {
            return NAN;
        }
        return new JsNumber(this.value / other.value);
    }

    /**
     * %
     */
    public JsNumber modulus(@Nonnull JsNumber other) {
        if (isNan(other)) {
            return NAN;
        }
        return new JsNumber(this.value % other.value);
    }

    /**
     * **
     */
    public JsNumber power(@Nonnull JsNumber other) {
        if (isNan(other)) {
            return NAN;
        }
        return new JsNumber(Math.pow(this.value, other.value));
    }

    /**
     * <
     */
    public JsBoolean lessThan(@Nonnull JsNumber other) {
        return TypeUtils.wrapBoolean(this.value < other.value);
    }

    /**
     * >
     */
    public JsBoolean greaterThan(@Nonnull JsNumber other) {
        return TypeUtils.wrapBoolean(this.value > other.value);
    }

    /**
     * <=
     */
    public JsBoolean lessThanEquals(@Nonnull JsNumber other) {
        return TypeUtils.wrapBoolean(this.value <= other.value);
    }

    /**
     * >=
     */
    public JsBoolean greaterThanEquals(@Nonnull JsNumber other) {
        return TypeUtils.wrapBoolean(this.value >= other.value);
    }

    @Override
    public String display() {
        if (isNan()) {
            return "NaN";
        }
        return FORMAT.format(getValue());
    }

    @Override
    public JsBoolean asBoolean() {
        return (isNan() || getValue() == 0) ? JsBoolean.FALSE : JsBoolean.TRUE;
    }
}
