package com.javaboy;

import java.util.regex.Pattern;

/**
 
 * 演示matches方法，用于整体匹配, 在验证输入的字符串是否满足条件使用
 */
public class PatternMethod {

    public static void main(String[] args) {
        String content = "hello abc hello, 韩顺平教育";
        //String regStr = "hello";
        String regStr = "hello.*";


        boolean matches = Pattern.matches(regStr, content);
        //Pattern p = Pattern.compile(regStr);
        //Matcher m = p.matcher(content);
        //boolean matches = m.matches();
        System.out.println("整体匹配= " + matches);
    }
}
