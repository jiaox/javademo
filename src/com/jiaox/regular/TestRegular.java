package com.jiaox.regular;

public class TestRegular {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ^[1][358][0-9]{9}$
		String regex="^[1][358][0-9]{9}$";
		String str1="13231619478";
		String str2="12345678990";
		String str3="5511553";
		System.out.println(str1.matches(regex));
		System.out.println(str2.matches(regex));
		System.out.println(str3.matches(regex));

	}

}
