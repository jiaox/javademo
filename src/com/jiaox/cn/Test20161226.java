package com.jiaox.cn;

public class Test20161226 {
	public static void main(String[] args) {
        String bmlxr="王旭/信息化事业部/天津联通,,4880";
        String userName=bmlxr.substring(0,bmlxr.indexOf("/"));
		String uid=bmlxr.substring(bmlxr.lastIndexOf(",")+1);
		
		System.out.println(userName+":"+uid);
	}
}
