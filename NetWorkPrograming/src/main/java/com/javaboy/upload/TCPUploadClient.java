package com.javaboy.upload;

import com.javaboy.utils.StreamUtils;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//客户端从磁盘里读取文件传给服务端
@Slf4j(topic = "c.TCPUploadClient")
public class TCPUploadClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        String file = "C:\\Users\\17477\\Desktop\\$}F7]$YMHFT5(G(]$U@S1T3.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
        //把文件读到放到一个数组里
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        bis.close();
        //发送给客户端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//字节流不用flush
        socket.shutdownOutput();
        //接收服务端回复消息
        InputStream is = socket.getInputStream();
        String s = StreamUtils.streamToString(is);
        log.debug("{}", s);
        bos.close();
        socket.close();


    }
}
