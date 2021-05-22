package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
class OpTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("1 + 2"), 3);
        assertEq(runFromString("1 - 2"), -1);
        assertEq(runFromString("1 * 2"), 2);
        assertEq(runFromString("1 / 2"), 0.5);
        assertEq(runFromString("1 % 2"), 1);


        assertEq(runFromString("1 > 2"), false);
        assertEq(runFromString("1 < 2"), true);
        assertEq(runFromString("1 >= 2"), false);
        assertEq(runFromString("1 <= 2"), true);
        assertEq(runFromString("1 === 2"), false);
        assertEq(runFromString("1 !== 2"), true);
        assertEq(runFromString("1 == 2"), false);
        assertEq(runFromString("1 != 2"), true);

        assertEq(runFromString("[1] + 2"), "12");
        assertEq(runFromString("[1] - 2"), -1);

        assertEq(runFromString("2 ** 4"), 16);

        assertEq(runFromString("true && true"), true);
        assertEq(runFromString("false && false"), false);
        assertEq(runFromString("true && false"), false);
        assertEq(runFromString("false && true"), false);

        assertEq(runFromString("true || true"), true);
        assertEq(runFromString("false || false"), false);
        assertEq(runFromString("true || false"), true);
        assertEq(runFromString("false || true"), true);

        assertEq(runFromString("true ? 1 : 2"), 1);
        assertEq(runFromString("false ? 1 : 2"), 2);

    }


}