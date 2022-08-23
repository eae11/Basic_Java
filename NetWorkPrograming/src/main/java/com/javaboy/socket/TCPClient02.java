package com.javaboy.socket;


import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

@Slf4j(topic = "c.TCPClient02")
public class TCPClient02 {
    public static void main(String[] args) throws IOException {
        //连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        log.debug("{}", socket);
        //写入数据
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write(new String("你好服务端\r\n"));
        //bw.write(new String("第二句话"));
        //bw.newLine();//写入结束标记 这种方式对方要用readline来读取 同"\r\n"
        bw.flush();//如果使用的字符流，需要手动刷新，否则数据不会写入数据通道
        //读取数据
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        log.debug("{}", s);

        bw.close();
        br.close();
        socket.close();

    }
}
