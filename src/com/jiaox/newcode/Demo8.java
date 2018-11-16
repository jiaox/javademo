package com.jiaox.newcode;

public class Demo8 {
	public static void main(String[] args) {
		Object object=new Object(){
			public boolean equals(Object obj){
				return true;
			}
		};
		System.out.println(object.equals("Fred"));
	}
}
