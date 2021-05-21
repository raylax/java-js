package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class StringTest extends BaseTest {

    @Test
    public void testString() {
        assertEq(runFromString("'123'"), "123");
        assertEq(runFromString("\"456\""), "456");
    }


}