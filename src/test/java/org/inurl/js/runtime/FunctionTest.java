package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

/**
 * @author raylax
 */
public class FunctionTest extends BaseTest {

    @Test
    public void test() {
        assertEq(runFromString("function a() { return 666 }; return a();"), 666);
        assertEq(runFromString("function a(v) { return v }; return a(666);"), 666);

        assertEq(runFromString("let a = function () { return 666 }; return a();"), 666);
        assertEq(runFromString("let a = function (v) { return v }; return a(666);"), 666);

        assertEq(runFromString("let a = () => { return 666 }; return a();"), 666);
        assertEq(runFromString("let a = () => 666; return a();"), 666);

        assertEq(runFromString("let a = (v) => v; return a(666);"), 666);
        assertEq(runFromString("let a = (v) => { return v }; return a(666);"), 666);

        assertEq(runFromString("let a = v => { return v }; return a(666);"), 666);
        assertEq(runFromString("let a = v => v; return a(666);"), 666);

        assertEq(runFromString("let a = (v = 111) => v; return a();"), 111);
        assertEq(runFromString("let a = function (v = 111) { return v }; return a();"), 111);
        assertEq(runFromString("function a(v = 111) { return v }; return a();"), 111);
        assertEq(runFromString("let a = (v = 111) => v; return a(666);"), 666);
        assertEq(runFromString("let a = function (v = 111) { return v }; return a(666);"), 666);
        assertEq(runFromString("function a(v = 111) { return v }; return a(666);"), 666);

    }

    @Test
    public void testNested() {
        assertEq(runFromString("function a() { let b = () => 666; return b }; return a()();"), 666);
    }


}