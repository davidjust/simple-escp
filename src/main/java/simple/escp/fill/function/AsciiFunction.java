package simple.escp.fill.function;

import simple.escp.dom.Line;
import simple.escp.dom.Page;
import simple.escp.dom.Report;
import java.util.regex.Matcher;

/**
 *  A built-in function that will return character based on ASCII number.  To use this function, use the following
 *  expression: <code>%{[number]}</code>.
 *
 *  <p>Examples:
 *
 *  <p>To print character for ASCII code 127, use: <code>%{127}</code>.
 */
public class AsciiFunction extends Function {

    /**
     * Create new instance of this function.
     */
    public AsciiFunction() {
        super("%\\{\\s*(\\d+)\\s*\\}");
    }
    
    @Override
    public String process(Matcher matcher, Report report, Page page, Line line) {
        return Character.toString((char) Integer.valueOf(matcher.group(1)).intValue());
    }
}