package d1;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class demo_02 {
    @Test
    void test01() {
        int i1 = 0x2f; // 16进制 (⼩写)
        System.out.println(
                "i1: " + Integer.toBinaryString(i1));
        int i2 = 0X2F; // 16进制 (⼤写)
        System.out.println(
                "i2: " + Integer.toBinaryString(i2));
        int i3 = 0177; // 8进制 (前导0)
        System.out.println(
                "i3: " + Integer.toBinaryString(i3));
        char c = 0xffff; // 最⼤ char 型16进制值
        System.out.println(
                "c: " + Integer.toBinaryString(c));
        byte b = 0x7f; // 最⼤ byte 型16进制值 10101111;
        System.out.println(
                "b: " + Integer.toBinaryString(b));
        short s = 0x7fff; // 最⼤ short 型16进制值
        System.out.println(
                "s: " + Integer.toBinaryString(s));
        long n1 = 200L; // long 型后缀
        long n2 = 200l; // long 型后缀 (容易与数值1混淆)
        long n3 = 200;
        // Java 7 ⼆进制字⾯值常量:
        byte blb = (byte) 0b00110101;
        System.out.println(
                "blb: " + Integer.toBinaryString(blb));
        short bls = (short) 0B0010111110101111;
        System.out.println(
                "bls: " + Integer.toBinaryString(bls));
        int bli = 0b00101111101011111010111110101111;
        System.out.println(
                "bli: " + Integer.toBinaryString(bli));
        long bll = 0b00101111101011111010111110101111;
        System.out.println(
                "bll: " + Long.toBinaryString(bll));
        float f1 = 1;
        float f2 = 1F; // float 型后缀
        float f3 = 1f; // float 型后缀
        double d1 = 1d; // double 型后缀
        double d2 = 1D; // double 型后缀
        // (long 型的字⾯值同样适⽤于⼗六进制和8进制 )
    }

    @Test
    void test02() {
        String a = "public static void reflection.ShowMethods.main(java.lang.String[])";
        Pattern p = Pattern.compile("\\w+\\.");
        Matcher matcher = p.matcher(a);
        //System.out.println(matcher.replaceAll(""));
    }
    @Test
    void test03() {
        Object[] objects = new Object[6];
        //Integer[] in = (Integer[]) objects;//cannot be cast to [Ljava.lang.Integer;
    }
}

