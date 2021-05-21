package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class IfTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("if (true) { return 1 } else { return 0 }"), 1);
        assertEq(runFromString("if (false) { return 1 } else { return 0 }"), 0);

        assertEq(runFromString("if (true) { return 1 }"), 1);
        assertEq(runFromString("if (false) { return 1 } return 0"), 0);

        assertEq(runFromString("if (1 == 2) { return 1 } else if (2 == 2) { return 2 }"), 2);
        assertEq(runFromString("if (1 == 2) { return 1 } else if (2 == 3) { return 2 } else { return 3 }"), 3);

    }

}