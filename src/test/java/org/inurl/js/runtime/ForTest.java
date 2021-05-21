package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class ForTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("let r = 0; for (;;) { if (++r > 3) { break; } }; return r"), 4);
        assertEq(runFromString("let r = 0; for (;++r < 3;) {  }; return r"), 3);
        assertEq(runFromString("let r = 0; for (;r++ < 3;) {  }; return r"), 4);
        assertEq(runFromString("let r = 0; for (let i = 0;i < 10; i++) { r = i }; return r"), 9);
        assertEq(runFromString("let r = 0; for (;; r++) { if (r > 5) { return r } }; return r"), 6);
        assertEq(runFromString("let r; for (r = 0;; r++) { if (r > 5) { return r } }; return r"), 6);

    }

}
