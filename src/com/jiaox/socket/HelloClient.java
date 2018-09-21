package com.jiaox.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class HelloClient {
	public static void main(String[] args) throws IOException {
		Socket hellosocket = null;
		BufferedReader in = null;
		try {
			hellosocket = new Socket("localhost",9999);
			in = new BufferedReader(new InputStreamReader(hellosocket.getInputStream()));
		} catch (UnknownHostException e) {
			System.err.println("Don't konw about host:localhost!");
			System.exit(1);
		} catch (IOException e) {
			System.err.println("Couldn't get I/O for the connection.");
			System.exit(1);
		}
		
		System.out.println(in.readLine());
		in.close();
		hellosocket.close();
	}
}
