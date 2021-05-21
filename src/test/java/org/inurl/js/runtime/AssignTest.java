package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class AssignTest extends BaseTest {

    @Test
    public void testString() {
        assertEq(runFromString("let a = 123; return a;"), 123);
        assertEq(runFromString("let a = 456; return a;"), 456);
    }


}