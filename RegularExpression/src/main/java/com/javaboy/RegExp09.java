package com.javaboy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 
 * 非贪婪匹配
 */
public class RegExp09 {
    public static void main(String[] args) {
        /*	当该字符紧跟在任何一个其他限制符（*,+,?，{n}，{n,}，{n,m}）后面时，匹配模式是非贪婪的。非贪婪模式尽可能少的匹配所搜索的字符串，
        而默认的贪婪模式则尽可能多的匹配所搜索的字符串。例如，对于字符串“oooo”，“o+?”将匹配单个“o”，而“o+”将匹配所有“o”。*/
        String content = "hello111111 ok";
        //String regStr = "\\d+"; //默认是贪婪匹配
        // String regStr = "\\d+?"; //非贪婪匹配
        String regStr = "\\d+?"; //非贪婪匹配

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
