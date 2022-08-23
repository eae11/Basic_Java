package com.javaboy.socket;


import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
//使用字节方式
@Slf4j(topic = "c.TCPClient02")
public class TCPClient01 {
    public static void main(String[] args) throws IOException {
        //连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        log.debug("{}", socket);
        //写入数据
        OutputStream os = socket.getOutputStream();
        os.write(new String("你好服务端").getBytes(StandardCharsets.UTF_8));
        os.write(new String("第二句话").getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();//设置结束标记
        //读取数据
        int j;
        byte[] bytes = new byte[1024];
        InputStream is = socket.getInputStream();
        while ((j = is.read(bytes)) != -1) {
            log.debug("{}", new String(bytes, 0, j));
        }
        os.close();
        is.close();
        socket.close();

    }
}
