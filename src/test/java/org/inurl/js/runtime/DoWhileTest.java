package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class DoWhileTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("let i = 1, r; do { r = i } while (i++ <= 3); return r;"), 4);
        assertEq(runFromString("let i = 3, r; do { r = i } while (i-- >= 0); return r;"), -1);
        assertEq(runFromString("let i = 1, r; do { r = i } while (++i <= 3); return r;"), 3);
        assertEq(runFromString("let i = 3, r; do { r = i } while (--i >= 0); return r;"), 0);

        assertEq(runFromString("let i = 3, r = 0; do { r = 1 } while (false); return r;"), 1);
    }

}
