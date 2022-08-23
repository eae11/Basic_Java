package d2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d3 {
    public static void main(String[] args) {
        String s = "aa   b  c";
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
        String a = "/*! Here's a block of text to use as input to\n" +
                "    the regular expression matcher. Note that we\n" +
                "    first extract the block of text by looking for\n" +
                "    the special delimiters, then process the\n" +
                "    extracted block. !*/";
        Pattern p = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL);
        Matcher matcher = p.matcher(a);
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}
