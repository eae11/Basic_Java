package com.javaboy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 
 */
public class RegExp13 {
    public static void main(String[] args) {
        String content = "我....我要....学学学学....编程java!";

        //1. 去掉所有的.

        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");

        System.out.println("content=" + content);//我我要学学学学编程java!

        //2. 去掉重复的字  我我要学学学学编程java!
        // 思路
        //(1) 使用 (.)\\1+
        //(2) 使用 反向引用$1 来替换匹配到的内容

        pattern = Pattern.compile("(.)\\1+");//分组的捕获内容记录到$1
        matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到=" + matcher.group(0));
        }
//
//        //使用 反向引用$1 来替换匹配到的内容|
        //$1表示之前分组1里捕获的内容,\\1是写在正则表达式里面的,放在外面要用//$1这种方式
        //这句话的含义表示匹配到了内容,就用$1的内容替换到找到的内容(看里面的源码find())
        content = matcher.replaceAll("$1");
        System.out.println("content=" + content);

        System.out.println("content=" + content);

        //使用一条语句 去掉重复的字  我我要学学学学编程java!
        //content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");

        //String.replaceAll() 其实就是上面这种方式
        String s = "我我要学学学学编程java!".replaceAll("(.)\\1+", "$1");
        System.out.println(s);
    }
}
