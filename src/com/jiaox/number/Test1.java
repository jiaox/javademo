package com.jiaox.number;

public class Test1 {
	public static void main(String[] args) {
		String num="0.9830de40474e25f62cade8a65a64bf08";
		
		System.out.println(isHexNumberRex(num));
	}
	
	private static boolean isHexNumberRex(String str){
		String validate = "(?i)[0-9a-f]+";
		return str.matches(validate);
	}

}
