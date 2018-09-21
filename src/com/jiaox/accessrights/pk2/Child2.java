package com.jiaox.accessrights.pk2;

import com.jiaox.accessrights.pk1.Father;

public class Child2 extends Father{
	public static void main(String[] args) {
		Father father = new Father();
		System.out.println("father对象访问："+father.param3);
		
		
		Child2 child2 = new Child2();
		System.out.println("child对象访问："+child2.param2);
		System.out.println("child对象访问："+child2.param3);
	}
}
