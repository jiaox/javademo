package com.jiaox.cn;

public class TestStatic {
	public static void main(String[] args) {
		DemoSay dm=new DemoSay();
		
		dm.say();
	}

}

class DemoSay{
	private static String aa="11111";
	
	public void say(){
		String aa="bb";
		
		System.out.println(aa);
	}
}
