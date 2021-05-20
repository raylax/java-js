package org.inurl.js.runtime;

import org.inurl.js.runtime.data.AbstractJsObject;
import org.inurl.js.runtime.data.DataHolder;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author raylax
 */
public class StackFrame implements DataHolder {

    private final StackFrame parent;
    private final Map<Object, AbstractJsObject<?>> data;
    private final int depth;

    public StackFrame(StackFrame parent) {
        this.parent = parent;
        this.depth = (parent == null) ? 0 : parent.depth + 1;
        this.data = new HashMap<>();
    }

    public boolean isRoot() {
        return depth == 0;
    }

    public void letVariable(String name, AbstractJsObject<?> value) {
        data.put(name, value);
    }

    public void setVariable(String name, AbstractJsObject<?> value) {
        if (data.containsKey(name) || isRoot()) {
            data.put(name, value);
        } else {
            parent.setVariable(name, value);
        }
    }

    public Optional<AbstractJsObject<?>> getVariable(Object name) {
        final AbstractJsObject<?> value = data.get(name);
        if (isRoot() || value != null) {
            return Optional.ofNullable(value);
        }
        return parent.getVariable(name);
    }

    public int getDepth() {
        return depth;
    }
}
