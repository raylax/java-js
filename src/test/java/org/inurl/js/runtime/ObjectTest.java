package org.inurl.js.runtime;

import org.inurl.js.runtime.data.AbstractJsObject;
import org.inurl.js.runtime.data.JsNumber;
import org.inurl.js.runtime.data.JsObject;
import org.inurl.js.runtime.data.JsString;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author raylax
 */
public class ObjectTest extends BaseTest {

    @Test
    public void test() {
        final JsObject object = runFromString("let a = 666; let k = () => 'x'; let o = {'a': a, 'b': '666', 'c': {'d': 123}, [k()]: 111 }; return o;").asObject();
        assertThat(object.getVariable("a")).isPresent().hasValue(new JsNumber(666));
        assertThat(object.getVariable("x")).isPresent().hasValue(new JsNumber(111));
        assertThat(object.getVariable("b")).isPresent().hasValue(new JsString("666"));
        final Optional<AbstractJsObject<?>> c = object.getVariable("c");
        assertThat(c).isPresent();
        assertThat(c.get().asObject().getVariable("d")).isPresent().hasValue(new JsNumber(123));
    }

}
