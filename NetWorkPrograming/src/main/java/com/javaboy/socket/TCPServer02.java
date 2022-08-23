package com.javaboy.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

@Slf4j(topic = "c.TCPServer02")
public class TCPServer02 {
    public static void main(String[] args) throws IOException {
        //在本机9999端口监听,等待连接
        ServerSocket server = new ServerSocket(9999);
        log.debug("{}", server);
        //如果有客户的连接返回客户端的Socket  阻塞
        Socket socket = server.accept();//可以与多个Socket相连 Socket是一个四元组,对方IP,端口,自己IP,端口
        log.debug("{}", socket);
        //读取数据
        /*int j;
        char[] chars = new char[1024];*/
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        log.debug("{}", s);
       /* while ((j = br.read(chars)) != -1) {
            log.debug("{}", new String(chars, 0, j));
        }*/
        //-----------
        //写入数据
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        bw.write("你好,客户端");
        bw.newLine();//插入一个换行符,表示结束
        bw.flush();

        br.close();
        bw.close();
        socket.close();
        server.close();
    }
}
