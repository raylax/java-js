package org.inurl.js.runtime;

import org.inurl.js.runtime.data.AbstractJsObject;
import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
class ReturnTest extends BaseTest {

    @Test
    public void testGlobalReturn() {
        assertEq(runFromString("return 1;"), 1);
        assertEq(runFromString("return '1';"), "1");
    }

    @Test
    public void testFunctionReturn() {
        final AbstractJsObject<?> result = runFromString("function test () { return 2; } return test();");
        assertEq(result, 2);
    }

}