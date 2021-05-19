package org.inurl.js.runtime.data;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author raylax
 */
public class JsArray extends JsFunction {

    public static final JsArray EMPTY = new JsArray(Collections.emptyList());

    public JsArray(List<AbstractJsObject<?>> value) {
        super(JsDataType.ARRAY);
        this.value = value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<AbstractJsObject<?>> getValue() {
        return (List<AbstractJsObject<?>>) super.getValue();
    }

    @Override
    public String display() {
        return "array";
    }

    @Override
    public String toString() {
        return getValue().stream().map(AbstractJsObject::toString).collect(Collectors.joining(","));
    }
}
