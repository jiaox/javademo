package com.jiaox.io;

import java.io.IOException;
import java.io.InputStream;

public class ReadInDemo {
	public static void main(String[] args) throws IOException {
		readIn();
	}
	
	public static void readIn() throws IOException{
		InputStream in=System.in;
		StringBuilder sb=new StringBuilder();
		while(true){
			int ch=in.read();
			if(ch=='\r'){
				continue;
			}
			if(ch=='\n'){
				String s =sb.toString();
				if("over".equals(s)){
					break;
				}
				System.out.println(s.toUpperCase());
				sb.delete(0, sb.length());
			}else{
				sb.append((char)ch);
			}
		}
	}
}
