package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class BuiltinTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("console.log('666'); return 666"), 666);
        assertEq(runFromString("console.error('666'); return 666"), 666);
    }

}
