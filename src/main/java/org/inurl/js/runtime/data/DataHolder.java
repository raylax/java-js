package org.inurl.js.runtime.data;

import java.util.Optional;

/**
 * @author raylax
 */
public interface DataHolder {

    default void letVariable(String name, AbstractJsObject<?> value) {
        throw new UnsupportedOperationException();
    }

    default void setVariable(String name, AbstractJsObject<?> value) {
        throw new UnsupportedOperationException();
    }

    default Optional<AbstractJsObject<?>> getVariable(String name) {
        throw new UnsupportedOperationException();
    }

}
