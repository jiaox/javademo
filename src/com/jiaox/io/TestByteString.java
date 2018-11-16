package com.jiaox.io;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import com.google.protobuf.ByteString;

public class TestByteString {
	public static void main(String[] args) throws UnsupportedEncodingException {ByteString bs = ByteString.copyFrom(new byte[]{10,-94,7,10,110,8,3,26,11,8,-118,-71,-20,-36,5,16,-128,-3,-27,88,34,12,105,110,100,101,120,99,104,97,110,110,101,108,42,64,99,51,55,101,56,101,99,102,98,49,50,97,102,53,54,101,102,56,50,56,55,49,102,57,49,50,56,102,48,101,99,56,48,48,52,52,51,53,57,52,51,51,57,57,56,100,49,48,56,97,48,48,54,57,53,49,56,57,56,101,54,99,52,56,58,13,18,11,18,9,100,111,112,101,101,114,115,99,99,18,-81,6,10,-110,6,10,7,79,114,103,50,77,83,80,18,-122,6,45,45,45,45,45,66,69,71,73,78,32,67,69,82,84,73,70,73,67,65,84,69,45,45,45,45,45,10,77,73,73,67,68,84,67,67,65,98,83,103,65,119,73,66,65,103,73,82,65,80,53,84,114,97,86,77,89,67,70,114,121,89,86,81,111,54,47,51,48,118,65,119,67,103,89,73,75,111,90,73,122,106,48,69,65,119,73,119,97,122,69,76,10,77,65,107,71,65,49,85,69,66,104,77,67,86,86,77,120,69,122,65,82,66,103,78,86,66,65,103,84,67,107,78,104,98,71,108,109,98,51,74,117,97,87,69,120,70,106,65,85,66,103,78,86,66,65,99,84,68,86,78,104,98,105,66,71,10,99,109,70,117,89,50,108,122,89,50,56,120,70,84,65,84,66,103,78,86,66,65,111,84,68,71,57,121,90,122,73,117,89,50,78,52,76,109,78,118,98,84,69,89,77,66,89,71,65,49,85,69,65,120,77,80,89,50,69,117,98,51,74,110,10,77,105,53,106,89,51,103,117,89,50,57,116,77,66,52,88,68,84,69,52,77,68,107,119,78,106,69,51,78,68,81,49,78,49,111,88,68,84,73,52,77,68,107,119,77,122,69,51,78,68,81,49,78,49,111,119,86,122,69,76,77,65,107,71,10,65,49,85,69,66,104,77,67,86,86,77,120,69,122,65,82,66,103,78,86,66,65,103,84,67,107,78,104,98,71,108,109,98,51,74,117,97,87,69,120,70,106,65,85,66,103,78,86,66,65,99,84,68,86,78,104,98,105,66,71,99,109,70,117,10,89,50,108,122,89,50,56,120,71,122,65,90,66,103,78,86,66,65,77,77,69,107,70,107,98,87,108,117,81,71,57,121,90,122,73,117,89,50,78,52,76,109,78,118,98,84,66,90,77,66,77,71,66,121,113,71,83,77,52,57,65,103,69,71,10,67,67,113,71,83,77,52,57,65,119,69,72,65,48,73,65,66,73,66,116,43,97,102,119,68,102,53,107,49,78,66,104,115,99,116,43,104,79,68,43,49,71,88,80,98,65,86,106,74,57,103,52,108,69,55,71,83,118,66,49,70,65,81,77,10,107,107,84,68,49,72,75,69,105,119,81,72,113,110,74,122,102,77,67,111,52,79,86,66,51,110,51,55,86,117,97,47,113,84,88,72,117,117,105,106,84,84,66,76,77,65,52,71,65,49,85,100,68,119,69,66,47,119,81,69,65,119,73,72,10,103,68,65,77,66,103,78,86,72,82,77,66,65,102,56,69,65,106,65,65,77,67,115,71,65,49,85,100,73,119,81,107,77,67,75,65,73,72,102,120,98,48,67,79,97,113,122,82,114,104,99,118,77,108,43,57,110,67,99,72,121,101,121,87,10,98,102,87,50,119,49,57,65,97,56,71,111,116,85,103,85,77,65,111,71,67,67,113,71,83,77,52,57,66,65,77,67,65,48,99,65,77,69,81,67,73,69,51,55,99,122,110,117,74,117,104,54,48,112,48,75,97,121,112,109,67,120,100,68,10,119,113,67,57,76,82,118,120,122,56,83,85,114,51,84,78,69,82,121,51,65,105,65,51,119,47,85,74,97,51,102,114,111,67,83,77,72,99,81,99,81,101,101,48,111,115,88,90,57,47,107,66,90,120,109,47,103,107,53,97,79,49,89,100,10,103,119,61,61,10,45,45,45,45,45,69,78,68,32,67,69,82,84,73,70,73,67,65,84,69,45,45,45,45,45,10,18,24,109,-91,-13,56,-20,40,-63,51,114,-42,-100,72,-104,-1,27,-36,-26,96,74,15,-32,64,73,-7,18,-116,15,10,-119,15,10,-81,6,10,-110,6,10,7,79,114,103,50,77,83,80,18,-122,6,45,45,45,45,45,66,69,71,73,78,32,67,69,82,84,73,70,73,67,65,84,69,45,45,45,45,45,10,77,73,73,67,68,84,67,67,65,98,83,103,65,119,73,66,65,103,73,82,65,80,53,84,114,97,86,77,89,67,70,114,121,89,86,81,111,54,47,51,48,118,65,119,67,103,89,73,75,111,90,73,122,106,48,69,65,119,73,119,97,122,69,76,10,77,65,107,71,65,49,85,69,66,104,77,67,86,86,77,120,69,122,65,82,66,103,78,86,66,65,103,84,67,107,78,104,98,71,108,109,98,51,74,117,97,87,69,120,70,106,65,85,66,103,78,86,66,65,99,84,68,86,78,104,98,105,66,71,10,99,109,70,117,89,50,108,122,89,50,56,120,70,84,65,84,66,103,78,86,66,65,111,84,68,71,57,121,90,122,73,117,89,50,78,52,76,109,78,118,98,84,69,89,77,66,89,71,65,49,85,69,65,120,77,80,89,50,69,117,98,51,74,110,10,77,105,53,106,89,51,103,117,89,50,57,116,77,66,52,88,68,84,69,52,77,68,107,119,78,106,69,51,78,68,81,49,78,49,111,88,68,84,73,52,77,68,107,119,77,122,69,51,78,68,81,49,78,49,111,119,86,122,69,76,77,65,107,71,10,65,49,85,69,66,104,77,67,86,86,77,120,69,122,65,82,66,103,78,86,66,65,103,84,67,107,78,104,98,71,108,109,98,51,74,117,97,87,69,120,70,106,65,85,66,103,78,86,66,65,99,84,68,86,78,104,98,105,66,71,99,109,70,117,10,89,50,108,122,89,50,56,120,71,122,65,90,66,103,78,86,66,65,77,77,69,107,70,107,98,87,108,117,81,71,57,121,90,122,73,117,89,50,78,52,76,109,78,118,98,84,66,90,77,66,77,71,66,121,113,71,83,77,52,57,65,103,69,71,10,67,67,113,71,83,77,52,57,65,119,69,72,65,48,73,65,66,73,66,116,43,97,102,119,68,102,53,107,49,78,66,104,115,99,116,43,104,79,68,43,49,71,88,80,98,65,86,106,74,57,103,52,108,69,55,71,83,118,66,49,70,65,81,77,10,107,107,84,68,49,72,75,69,105,119,81,72,113,110,74,122,102,77,67,111,52,79,86,66,51,110,51,55,86,117,97,47,113,84,88,72,117,117,105,106,84,84,66,76,77,65,52,71,65,49,85,100,68,119,69,66,47,119,81,69,65,119,73,72,10,103,68,65,77,66,103,78,86,72,82,77,66,65,102,56,69,65,106,65,65,77,67,115,71,65,49,85,100,73,119,81,107,77,67,75,65,73,72,102,120,98,48,67,79,97,113,122,82,114,104,99,118,77,108,43,57,110,67,99,72,121,101,121,87,10,98,102,87,50,119,49,57,65,97,56,71,111,116,85,103,85,77,65,111,71,67,67,113,71,83,77,52,57,66,65,77,67,65,48,99,65,77,69,81,67,73,69,51,55,99,122,110,117,74,117,104,54,48,112,48,75,97,121,112,109,67,120,100,68,10,119,113,67,57,76,82,118,120,122,56,83,85,114,51,84,78,69,82,121,51,65,105,65,51,119,47,85,74,97,51,102,114,111,67,83,77,72,99,81,99,81,101,101,48,111,115,88,90,57,47,107,66,90,120,109,47,103,107,53,97,79,49,89,100,10,103,119,61,61,10,45,45,45,45,45,69,78,68,32,67,69,82,84,73,70,73,67,65,84,69,45,45,45,45,45,10,18,24,109,-91,-13,56,-20,40,-63,51,114,-42,-100,72,-104,-1,27,-36,-26,96,74,15,-32,64,73,-7,18,-44,8,10,60,10,58,10,56,8,1,18,11,18,9,100,111,112,101,101,114,115,99,99,26,39,10,10,80,117,116,68,111,80,101,101,114,115,10,3,99,99,120,10,5,112,101,101,114,48,10,13,49,57,50,46,49,54,56,46,48,46,49,49,49,18,-109,8,10,-81,1,10,32,-65,19,16,86,-52,94,60,-55,-53,-124,-122,-83,22,-16,-55,4,19,1,117,51,-127,-128,65,-44,25,-11,75,-97,-103,35,-17,-12,18,-118,1,10,88,18,59,10,9,100,111,112,101,101,114,115,99,99,18,46,26,44,10,27,0,68,111,80,101,101,114,115,0,68,111,80,101,101,114,115,0,99,99,120,0,112,101,101,114,48,0,26,13,49,57,50,46,49,54,56,46,48,46,49,49,49,18,25,10,4,108,115,99,99,18,17,10,15,10,9,100,111,112,101,101,114,115,99,99,18,2,8,3,26,28,8,-56,1,26,23,83,97,118,101,32,68,111,80,101,101,114,115,32,115,117,99,99,101,115,115,46,46,46,34,16,18,9,100,111,112,101,101,114,115,99,99,26,3,49,46,48,18,-34,6,10,-110,6,10,7,79,114,103,50,77,83,80,18,-122,6,45,45,45,45,45,66,69,71,73,78,32,67,69,82,84,73,70,73,67,65,84,69,45,45,45,45,45,10,77,73,73,67,68,106,67,67,65,98,83,103,65,119,73,66,65,103,73,82,65,78,47,118,104,113,121,109,75,112,57,65,74,73,89,89,76,71,75,119,118,112,73,119,67,103,89,73,75,111,90,73,122,106,48,69,65,119,73,119,97,122,69,76,10,77,65,107,71,65,49,85,69,66,104,77,67,86,86,77,120,69,122,65,82,66,103,78,86,66,65,103,84,67,107,78,104,98,71,108,109,98,51,74,117,97,87,69,120,70,106,65,85,66,103,78,86,66,65,99,84,68,86,78,104,98,105,66,71,10,99,109,70,117,89,50,108,122,89,50,56,120,70,84,65,84,66,103,78,86,66,65,111,84,68,71,57,121,90,122,73,117,89,50,78,52,76,109,78,118,98,84,69,89,77,66,89,71,65,49,85,69,65,120,77,80,89,50,69,117,98,51,74,110,10,77,105,53,106,89,51,103,117,89,50,57,116,77,66,52,88,68,84,69,52,77,68,107,119,78,106,69,51,78,68,81,49,78,49,111,88,68,84,73,52,77,68,107,119,77,122,69,51,78,68,81,49,78,49,111,119,86,122,69,76,77,65,107,71,10,65,49,85,69,66,104,77,67,86,86,77,120,69,122,65,82,66,103,78,86,66,65,103,84,67,107,78,104,98,71,108,109,98,51,74,117,97,87,69,120,70,106,65,85,66,103,78,86,66,65,99,84,68,86,78,104,98,105,66,71,99,109,70,117,10,89,50,108,122,89,50,56,120,71,122,65,90,66,103,78,86,66,65,77,84,69,110,66,108,90,88,73,119,76,109,57,121,90,122,73,117,89,50,78,52,76,109,78,118,98,84,66,90,77,66,77,71,66,121,113,71,83,77,52,57,65,103,69,71,10,67,67,113,71,83,77,52,57,65,119,69,72,65,48,73,65,66,78,113,103,99,103,54,74,118,105,85,98,116,99,111,115,113,121,76,112,103,87,108,102,57,83,48,101,87,102,107,89,104,82,70,112,79,98,97,87,111,115,70,83,107,116,81,68,10,109,113,69,120,81,55,75,114,80,106,47,115,43,83,120,105,119,76,73,83,50,77,78,87,52,73,102,87,84,54,115,66,107,50,122,43,73,51,50,106,84,84,66,76,77,65,52,71,65,49,85,100,68,119,69,66,47,119,81,69,65,119,73,72,10,103,68,65,77,66,103,78,86,72,82,77,66,65,102,56,69,65,106,65,65,77,67,115,71,65,49,85,100,73,119,81,107,77,67,75,65,73,72,102,120,98,48,67,79,97,113,122,82,114,104,99,118,77,108,43,57,110,67,99,72,121,101,121,87,10,98,102,87,50,119,49,57,65,97,56,71,111,116,85,103,85,77,65,111,71,67,67,113,71,83,77,52,57,66,65,77,67,65,48,103,65,77,69,85,67,73,81,68,77,66,110,86,97,113,54,80,69,88,57,74,80,66,75,54,114,47,103,53,98,10,49,106,51,98,68,49,76,110,75,85,68,100,106,105,79,89,74,97,71,111,76,103,73,103,68,81,110,50,89,82,104,104,88,110,53,117,80,90,102,120,107,87,79,105,75,90,122,114,56,106,87,68,119,99,47,115,119,80,98,110,120,113,51,76,10,82,114,48,61,10,45,45,45,45,45,69,78,68,32,67,69,82,84,73,70,73,67,65,84,69,45,45,45,45,45,10,18,71,48,69,2,33,0,-100,-48,107,-83,111,-6,-122,-98,19,75,92,-1,20,-95,40,-48,-50,-4,25,-9,38,-23,9,42,-28,44,120,59,-20,-111,83,8,2,32,6,103,18,-29,-48,40,38,-50,-18,-26,-4,37,-18,119,-19,82,-3,-17,14,-38,123,61,-63,78,-103,-63,-35,18,95,54,-51,124});
    byte[] bs1 = bs.toByteArray();
    for (byte temp: bs1) {
    	System.out.print((char)temp);
//    	System.out.print(",");
    }
    }
	
	
	
	
	 public static char byteToChar(byte[] b) {
		char c = (char) (((b[0] & 0xFF00) << 8) | (b[1] & 0xFF));
//		 char c = (char)(((b[0]<<8)&0xFF00)|(b[1]&0xFF));
//		 char c = (char)(b[1]&0xFF);
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
