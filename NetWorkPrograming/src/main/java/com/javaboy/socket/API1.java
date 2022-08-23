package com.javaboy.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class API1 {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//zyr01/192.168.0.7
        System.out.println(localHost.getHostName());//zyr01
        System.out.println(localHost.getHostAddress());//192.168.0.7
        System.out.println("---------------------");
        //根据主机名获取InetAddress对象
        InetAddress zyr = InetAddress.getByName("zyr01");
        System.out.println(zyr);//zyr01/192.168.0.7
        System.out.println(zyr.getHostName());//zyr01
        System.out.println(zyr.getHostAddress());//192.168.0.7
        System.out.println("---------------------");
        //根据域名获取InetAddress对象
        InetAddress baidu = InetAddress.getByName("www.baidu.com");
        System.out.println(baidu);//www.baidu.com/14.215.177.39
        System.out.println(baidu.getHostName());//www.baidu.com获取主机名或域名
        System.out.println(baidu.getHostAddress());//14.215.177.39
        System.out.println("---------------------");
        InetAddress zyr2 = InetAddress.getByName("172.18.96.1");
        System.out.println(zyr2);

    }
}
