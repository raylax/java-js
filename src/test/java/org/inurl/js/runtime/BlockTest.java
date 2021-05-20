package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
class BlockTest extends BaseTest {

    @Test
    public void testString() {
        assertEq(runFromString("let a = 1, b; { let a = 2; b = a + 1 }; return b;"), 3);
        assertEq(runFromString("let a = 1; { let a = 2; a = a + 1 }; return a;"), 1);
    }


}