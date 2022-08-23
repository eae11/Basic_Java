package d1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Random;

public class demo_01 {
    @Test
    void test01() {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));
        long l = -1;
        System.out.println(Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));
        short s = -1;
        System.out.println(Integer.toBinaryString(s) + "aa");
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));
        byte b = -1;
        System.out.println(Integer.toBinaryString(b));
        b >>>= 10;//当⽆符号右移与赋值相结合时，若将其与 byte 或 short ⼀起使⽤的话无效  b>>>10有效
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 10));

    }

    @Test
    void test02() throws UnsupportedEncodingException {
        System.out.println("王");
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("file.encoding=" + System.getProperty("file.encoding"));
        System.out.println("Default Charset=" + Charset.defaultCharset());
        System.out.println("Default Charset in Use=" + getDefaultCharSet());
    }

    private static String getDefaultCharSet() {
        OutputStreamWriter writer = new OutputStreamWriter(new ByteArrayOutputStream());
        String enc = writer.getEncoding();
        return enc;
    }

    @Test
    void test03() throws UnsupportedEncodingException {
        System.out.println(new String("啊").getBytes("gbk").length);
        System.out.println(new String("啊").getBytes("utf8").length);
        System.out.println(new String("啊").getBytes("utf16").length);
        System.out.println(new String("啊").getBytes("utf-16le").length);
        System.out.println(new String("啊").getBytes("utf-16be").length);

    }

    @Test
    void test04() {
        //char a = "\uD83E\uDDD0";//直接报错了
        String a = "\uD83E\uDDD0";
        System.out.println(a);//🧐
        System.out.println(1 == 1.0);


    }
    @Test
    void test05() {

        Random rand = new Random(47);
        for(int i = 0; i < 100; i++) {
            int c = rand.nextInt(26) + 'a';
            System.out.print((char) c + ", " + c + ": ");
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("vowel");
                    break;
                case 'y':
                case 'w':
                    System.out.println("Sometimes vowel");
                    break;
                default:
                    System.out.println("consonant");
            }
        }
    }
}
