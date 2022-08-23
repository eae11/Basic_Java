package com.javaboy.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

//既可以发送也可以接收
@Slf4j(topic = "c.UDPReceiver01")
public class UDPReceiver01 {
    public static void main(String[] args) throws IOException {
        //在9998端口接收数据
        DatagramSocket socket = new DatagramSocket(9998);
        //System.out.println(socket.getPort());//-1
        //2.构建一个DatagramPacket
        //UDP最大一个包64kb
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //接收数据,数据填充到DatagramPacket  阻塞
        socket.receive(packet);
        //从DatagramPacket取出数据
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();
        log.debug("{}", new String(data, 0, length));
        //在调用了receive后获取的就是对方端口,否则-1
        //System.out.println(packet.getPort());//对方端口9999


        //回复数据
        byte[] data2 = "我好怕怕".getBytes();
        packet = new DatagramPacket(data2, 0, data2.length, InetAddress.getLocalHost(), packet.getPort());
        socket.send(packet);

        socket.close();
    }
}
