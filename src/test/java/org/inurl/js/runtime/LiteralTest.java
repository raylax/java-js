package org.inurl.js.runtime;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author raylax
 */
public class LiteralTest extends BaseTest {

    @Test
    public void testNull() {
        assertThat(runFromString("null").isNull()).isTrue();
    }

    @Test
    public void testBoolean() {
        assertThat(runFromString("true").asBoolean().getValue()).isTrue();
        assertThat(runFromString("false").asBoolean().getValue()).isFalse();
    }

}
