package com.jiaox.cn;

public class TestNumberFormat {
	public static void main(String[] args) {
		String aString="0.6ce5f42dd19b2e3897555f9a14ddbc61";
		
		long tmpid = 1000000000 + Long.parseLong(aString);
		
		System.out.println(tmpid);
	}
}
