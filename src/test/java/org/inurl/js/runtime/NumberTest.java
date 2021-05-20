package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class NumberTest extends BaseTest {

    @Test
    public void testDecimal() {
        assertEq(runFromString("1"), 1d);
        assertEq(runFromString("1.23"), 1.23d);
    }

    @Test
    public void testHex() {
        assertEq(runFromString("0xfffff"), 0xfffff);
        assertEq(runFromString("0x00000"), 0x00000);
    }

    @Test
    public void testOctal() {
        assertEq(runFromString("0o00000"), 000000);
        assertEq(runFromString("0o77777"), 077777);
        assertEq(runFromString("000000"), 000000);
        assertEq(runFromString("077777"), 077777);
    }

    @Test
    public void testBinary() {
        assertEq(runFromString("0b00000"), 0b00000);
        assertEq(runFromString("0b11111"), 0b11111);
    }

}
