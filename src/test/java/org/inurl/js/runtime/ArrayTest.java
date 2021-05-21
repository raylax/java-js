package org.inurl.js.runtime;

import org.inurl.js.runtime.data.JsNumber;
import org.inurl.js.runtime.data.JsString;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author raylax
 */
public class ArrayTest extends BaseTest {

    @Test
    public void testArray() {
        assertThat(runFromString("[]").asArray().getValue()).isEmpty();
        assertThat(runFromString("[1, 2, 3]").asArray().getValue())
                .contains(new JsNumber(1), new JsNumber(2), new JsNumber(3));
        assertThat(runFromString("['1', '2', '3']").asArray().getValue())
                .contains(new JsString("1"), new JsString("2"), new JsString("3"));
    }


}