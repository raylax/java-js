package org.inurl.js.runtime;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.inurl.js.lexer.JsLexer;
import org.inurl.js.lexer.JsParser;

/**
 * @author raylax
 */
public class Runtime {

    public void run(CharStream source) {
        JsLexer lexer = new JsLexer(source);
        TokenStream tokens = new CommonTokenStream(lexer);
        JsParser parser = new JsParser(tokens);
        final ParseTree tree = parser.program();
        new ASTEvaluator().visit(tree);
    }

}
