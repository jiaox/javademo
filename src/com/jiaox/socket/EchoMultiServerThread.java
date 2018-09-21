package com.jiaox.socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class EchoMultiServerThread extends Thread{
	private Socket socket =null;
	public EchoMultiServerThread(Socket socket){
		super("EchoMultiServerThread");
		this.socket = socket;
	}
	
	public void run(){
		try {
			PrintWriter out = null;
			BufferedReader in = null;
			out = new PrintWriter(socket.getOutputStream(),true);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			out.println("Hello!...");
			out.println("Enter BYE to exit");
			out.flush();
			while(true){
				String str = in.readLine();
				if(str==null){
					break;
				}else{
					out.println("Echo:"+str);
					out.flush();
					if(str.trim().equalsIgnoreCase("BYE")){
						break;
					}
				}
			}
			
			out.close();
			in.close();
			socket.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
