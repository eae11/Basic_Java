package com.javaboy.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

//使用字节方式
@Slf4j(topic = "c.TCPServer01")
public class TCPServer01 {
    public static void main(String[] args) throws IOException {
        //在本机9999端口监听,等待连接
        ServerSocket server = new ServerSocket(9999);
        log.debug("{}", server);
        //如果有客户的连接返回客户端的Socket  阻塞
        Socket socket = server.accept();//可以与多个Socket相连 Socket是一个四元组,对方IP,端口,自己IP,端口
        log.debug("{}", socket);
        //读取数据
        int j;
        byte[] bytes = new byte[1024];
        InputStream is = socket.getInputStream();
        while ((j = is.read(bytes)) != -1) {
            log.debug("{}", new String(bytes, 0, j));
        }
        //写入数据
        OutputStream os = socket.getOutputStream();
        os.write(new String("你好客户端").getBytes(StandardCharsets.UTF_8));
        socket.shutdownOutput();
        is.close();
        os.close();
        socket.close();
        server.close();
    }
}
