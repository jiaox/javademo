package com.jiaox.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		PrintWriter out =null;
		BufferedReader in = null;
		try {
			serverSocket = new ServerSocket(1111);
		} catch (IOException e) {
			System.err.println("Could not listen on port:1111");
			System.exit(1);
		}
		
		Socket incoming = null;
		while(true){
			incoming = serverSocket.accept();
			out = new PrintWriter(incoming.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(incoming.getInputStream()));
			out.println("Hello!...");
			out.println("Enter BYE to exit");
			out.flush();
			while(true){
				//只有当用户输入时才返回数据
				String str = in.readLine();
				//当用户连接断掉时会返回空值
				if(str==null){
					//退出循环
					break;
				}else{
					//对用户输入字串加前缀Echo
					out.println("Echo:"+str);
					out.flush();
					if(str.trim().equalsIgnoreCase("BYE")){
						break;
					}
				}
				//收尾工作
				out.close();
				in.close();
				incoming.close();
				serverSocket.close();
			}
		}
	}
}
