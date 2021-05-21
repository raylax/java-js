package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class WhileTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("let i = 1, r; while (i++ <= 3) { r = i }; return r;"), 4);
        assertEq(runFromString("let i = 3, r; while (i-- >= 0) { r = i }; return r;"), -1);
        assertEq(runFromString("let i = 1, r; while (++i <= 3) { r = i }; return r;"), 3);
        assertEq(runFromString("let i = 3, r; while (--i >= 0) { r = i }; return r;"), 0);

        assertEq(runFromString("let i = 3, r = 0; while (false) { r = 1 }; return r;"), 0);
    }

}
