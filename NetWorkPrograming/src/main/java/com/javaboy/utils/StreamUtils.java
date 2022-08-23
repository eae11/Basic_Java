package com.javaboy.utils;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class StreamUtils {
    public static void main(String[] args) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(new String("aaa").getBytes(StandardCharsets.UTF_8));
        String s = streamToString(bis);
        System.out.println(s);
    }

    public static byte[] streamToByteArray(InputStream is) throws IOException {
        //把字节流转成字节数组
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;
        while ((len = is.read(b)) != -1) {
            bos.write(b, 0, len);
        }
        byte[] array = bos.toByteArray();
        bos.close();
        return array;
    }

    public static String streamToString(InputStream is) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }
/*    public static String streamToString(InputStream is) throws IOException {
        byte[] b = new byte[1024];
        int len;
        StringBuilder sb = new StringBuilder();
        while ((len = is.read(b)) != -1) {
            sb.append(new String(b, 0, len));
        }
        return sb.toString();
    }*/

}
