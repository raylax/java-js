package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
class SwitchTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("switch (1) { case 1: return 1; case 2: return 2; case 3: return 3; default: return 666; }"), 1);
        assertEq(runFromString("switch (8) { case 1: return 1; case 2: return 2; case 3: return 3; default: return 666; }"), 666);
        assertEq(runFromString("switch (1) { case 1:case 2:case 3: return 3; default: return 666; }"), 3);
        assertEq(runFromString("switch (2) { case 1:case 2:case 3: return 3; default: return 666; }"), 3);
        assertEq(runFromString("switch (3) { case 1:case 2:case 3: return 3; default: return 666; }"), 3);
        assertEq(runFromString("switch (4) { case 1:case 2:case 3: return 3; default: return 666; }"), 666);
        assertEq(runFromString("switch (3) { case 1:case 2: default: return 666; case 3: return 3; }"), 3);


        assertEq(runFromString("switch (1) { case 1:case 2: { console.error(1); } case 3: return 3; default: return 666; }"), 3);
        runFromString("switch (1) { case 1: { console.error(1) } case 2: { console.error(2); break; } case 3: { console.error(3) } default: return 666; }");
    }

}