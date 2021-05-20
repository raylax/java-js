package org.inurl.js.runtime;

import org.antlr.v4.runtime.CharStreams;
import org.inurl.js.runtime.data.AbstractJsObject;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author raylax
 */
public class BaseTest {

   public AbstractJsObject<?> runFromString(String source) {
       return new Runtime().run(CharStreams.fromString(source));
   }

   public void assertEq(AbstractJsObject<?> actual, double expect) {
       assertThat(actual.isNumber()).isTrue();
       assertThat(actual.getValue()).isEqualTo(expect);
   }

   public void assertEq(AbstractJsObject<?> actual, String expect) {
       assertThat(actual.isString()).isTrue();
       assertThat(actual.getValue()).isEqualTo(expect);
   }

   public void assertEq(AbstractJsObject<?> actual, boolean expect) {
       assertThat(actual.isBoolean()).isTrue();
       assertThat(actual.getValue()).isEqualTo(expect);
   }

}
