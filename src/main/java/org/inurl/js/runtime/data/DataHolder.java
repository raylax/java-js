package org.inurl.js.runtime.data;

import java.util.Optional;

/**
 * @author raylax
 */
public interface DataHolder {

    default void letVariable(Object name, AbstractJsObject<?> value) {
        throw new UnsupportedOperationException();
    }

    default void setVariable(Object name, AbstractJsObject<?> value) {
        throw new UnsupportedOperationException();
    }

    default Optional<AbstractJsObject<?>> getVariable(Object name) {
        throw new UnsupportedOperationException();
    }

}
