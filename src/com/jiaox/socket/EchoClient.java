package com.jiaox.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
	public static void main(String[] args) throws IOException {
		Socket echoSocket=null;
		PrintWriter out = null;
		BufferedReader in = null;
		try {
			echoSocket = new Socket("localhost",1111);
			out = new PrintWriter(echoSocket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(echoSocket.getInputStream()));
		} catch (UnknownHostException e) {
			System.err.println("Don't know about host:localhost");
			System.exit(1);
		} 
		System.out.println(in.readLine());
		System.out.println(in.readLine());
		BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
		String userInput;
		while((userInput = stdIn.readLine())!=null){
			out.println(userInput);
			System.out.println(in.readLine());
		}
		out.close();
		in.close();
		echoSocket.close();
	}
}
