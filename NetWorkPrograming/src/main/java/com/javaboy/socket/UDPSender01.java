package com.javaboy.socket;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

//既可以发送也可以接收
@Slf4j(topic = "c.UDPSender01")
public class UDPSender01 {
    public static void main(String[] args) throws IOException {
        //在9999端口发送数据
        DatagramSocket socket = new DatagramSocket(9999);
        //System.out.println(socket.getPort());//-1
        //2.构建一个DatagramPacket
        //UDP最大一个包64kb
        byte[] data = "今晚来我家".getBytes(StandardCharsets.UTF_8);
        //往哪个地方发送
        DatagramPacket packet = new DatagramPacket(data, 0, data.length, InetAddress.getByName("192.168.0.7"), 9998);
        socket.send(packet);
        //System.out.println(packet.getPort());//9998

        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, 0, buf.length);
        //接收数据,数据填充到DatagramPacket  阻塞
        socket.receive(packet);
        int length = packet.getLength();
        byte[] data1 = packet.getData();
        log.debug("{}", new String(data1, 0, length));
        socket.close();
    }
}
