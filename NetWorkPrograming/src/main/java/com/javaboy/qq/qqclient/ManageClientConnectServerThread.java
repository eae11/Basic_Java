package com.javaboy.qq.qqclient;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 
 * 该类管理客户端连接到服务器端的线程的类
 */
public class ManageClientConnectServerThread {
    //我们把多个线程放入一个HashMap集合，key 就是用户id, value 就是线程
    private static ConcurrentHashMap<String, ClientConnectServerThread> hm = new ConcurrentHashMap<>();

    //将某个线程加入到集合
    public static void addClientConnectServerThread(String userId, ClientConnectServerThread clientConnectServerThread) {
        hm.put(userId, clientConnectServerThread);
    }

    //通过userId 可以得到对应线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId) {
        return hm.get(userId);
    }

}
