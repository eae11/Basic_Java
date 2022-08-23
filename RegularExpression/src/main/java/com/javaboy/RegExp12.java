package com.javaboy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 
 * 反向引用
 */
/*
圆括号的内容被捕获后，可以在这个括号后被使用，从而写出一个比较实用的匹配模式，这个我们称为反向引用，
这种引用既可以是在正则表达式内部，也可以是在正则表达式外部，内部反向引用\\分组号，外部反向引用$分组号
*/
public class RegExp12 {
    public static void main(String[] args) {

        String content = "h1234el9876lo33333 j12324-333999111a1551ck14 tom11 jack22 yyy12345 xxx";
        //要匹配两个连续的相同数字 :  (\\d)\\1   (\\d)被分组后  \\1表示分组1的内容再出现一次
        //String regStr = "(\\d)\\1";
        //要匹配五个连续的相同数字： (\\d)\\1{4}  \\1{4}表示分组1出现的内容再出现4次
        //String regStr = "(\\d)\\1{4}";
        //要匹配个位与千位相同，十位与百位相同的数 5225 , 1551  (\\d)(\\d)\\2\\1
        //String regStr = "(\\d)(\\d)\\2\\1";

        /**
         * 请在字符串中检索商品编号,形式如:12321-333999111 这样的号码,
         * 要求满足前面是一个五位数,然后一个-号,然后是一个九位数,连续的每三位要相同
         */
        String regStr = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";


        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到 " + matcher.group(0));
        }

    }
}
