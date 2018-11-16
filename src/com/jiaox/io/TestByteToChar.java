package com.jiaox.io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Base64;

public class TestByteToChar {
	public static void main(String[] args) {
		
		String ss="\346\235\216";
		System.out.println(ss);
		 byte[] bytes = ss.getBytes();
		 for(byte b:bytes){
			 System.out.print(b);
			 System.out.print(",");
		 }
        //Base64 Encoded
        String encoded = Base64.getEncoder().encodeToString(bytes);
         
        //Base64 Decoded
        byte[] decoded = Base64.getDecoder().decode(encoded);
         System.out.println();
        //Verify original content
        System.out.println( new String(decoded) );
        
	}
	
	 public static char byteToChar(byte[] b) {
			char c = (char) (((b[0] & 0xFF00) << 8) | (b[1] & 0xFF));
			return c;
		 }
		 public static byte[] charToByte(char c) {
		 	byte[] b = new byte[2];
	        b[0] = (byte) ((c & 0xFF00) >> 8);
	        b[1] = (byte) (c & 0xFF);
	        return b;
	    }
		 
		 public static char[] getChars(byte[] b) {
			 Charset cs=Charset.forName("UTF-8");
			 ByteBuffer bb =ByteBuffer.allocate(b.length);
			 bb.put(b);
			 bb.flip();
			 CharBuffer cb=cs.decode(bb);
			return cb.array();
		 }
}
