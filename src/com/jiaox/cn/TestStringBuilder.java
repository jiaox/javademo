package com.jiaox.cn;

public class TestStringBuilder {
	public static void main(String[] args) {
		StringBuilder stringBuilder=new StringBuilder();
		stringBuilder.append("hello");
		stringBuilder.append(" world");
		
		String string =stringBuilder.toString();
		
		stringBuilder.delete(0, stringBuilder.length());
		
		System.out.println(stringBuilder.toString());
		System.out.println(string);
	}
}
