package com.jiaox.cn;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TestSocketClient {
   public static void main(String[] args) {
	   try {
		   
		Socket so=new Socket("10.26.13.196",8801);
		System.out.println("连接成功");
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("连接失败");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("连接失败");
	}
   }
}
