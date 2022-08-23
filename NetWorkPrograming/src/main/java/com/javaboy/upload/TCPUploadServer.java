package com.javaboy.upload;

import com.javaboy.utils.StreamUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

//服务端收到文件,把文件读到然后写到指定路径,然后回复收到图片
@Slf4j(topic = "c.TCPUploadServer")
public class TCPUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket socket = serverSocket.accept();
        //把文件数组读到
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //写到磁盘上
        FileOutputStream fos = new FileOutputStream("d:\\1.png");
        fos.write(bytes);
        fos.close();

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        bw.write("收到图片");
        bw.newLine();
        bw.flush();

        bis.close();
        serverSocket.close();

    }
}
