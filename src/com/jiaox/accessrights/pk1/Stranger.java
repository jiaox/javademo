package com.jiaox.accessrights.pk1;

import com.jiaox.accessrights.pk2.Child2;

public class Stranger {
	public static void main(String[] args) {
		Father father=new Father();
		System.out.println("father对象访问："+father.param2);
		System.out.println("father对象访问："+father.param3);
		System.out.println("father对象访问："+father.param4);
		
		Child child = new Child();
		System.out.println("child对象访问："+child.param2);
		System.out.println("child对象访问："+child.param3);
		System.out.println("child对象访问："+child.param4);
		
		
		Child2 child2 =new Child2();
		System.out.println("child2对象访问："+child2.param2);
		System.out.println("child2对象访问："+child2.param3);
		
	}
}
