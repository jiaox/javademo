package com.jiaox.socket;

import java.io.IOException;
import java.net.ServerSocket;

public class EchoServerThread {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null ;
		boolean listening = true ;
		try {
			serverSocket = new ServerSocket(1111);
		} catch (Exception e) {
			System.err.println("Could not listen on port :1111");
			System.exit(1);
		}
		while(listening){
			new EchoMultiServerThread(serverSocket.accept()).start();
		}
		//将serverSocket 的关闭操作放在循环外
		//只有当监听为false ，服务才关闭
		serverSocket.close();
	}
}
