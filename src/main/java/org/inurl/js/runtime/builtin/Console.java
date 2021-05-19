package org.inurl.js.runtime.builtin;

import org.inurl.js.runtime.data.AbstractJsObject;
import org.inurl.js.runtime.data.JsFunction;

import java.io.PrintStream;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author raylax
 */
public class Console extends JsFunction {

    @Function
    public void log(List<AbstractJsObject<Object>> arguments) {
        log(System.out, arguments);
    }

    @Function
    public void error(List<AbstractJsObject<Object>> arguments) {
        log(System.err, arguments);
    }

    private void log(PrintStream out, List<AbstractJsObject<Object>> arguments) {
        out.println(arguments.stream().map(AbstractJsObject::toString).collect(Collectors.joining(" ")));
    }

}
