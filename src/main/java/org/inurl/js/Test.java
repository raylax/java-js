package org.inurl.js;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.inurl.js.runtime.Runtime;

/**
 * @author raylax
 */
public class Test {

    public static void main(String[] args) {
        Runtime runtime = new Runtime();
        final CharStream source = CharStreams.fromString(
//                "// 测试代码\n" +
//                "let a = 1;\n" +
//                "let b = 2;\n" +
//                "let c = 3\n" +
//                "console.log(a, b, c, a + b * c);"+
//                "let arr = [1, 2, 3];"+
//                "console.log(arr, [4, 5, 6]);"+
                "let log = (message, prefix = '>>>') => { console.log(prefix + ' ' + message) };"+
                "log('log 1 default prefix');"+
                "log('log 1 custom prefix', '==>');" +
                "let log2 = message => { console.log('--> ' + message) };" +
                "log2('log 2');" +
                "let log3 = message => console.log('->> ' + message);" +
                "log3('log 3');"
        );
        runtime.run(source);
    }

}
