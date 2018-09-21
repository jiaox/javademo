package com.jiaox.accessrights.pk1;

import com.jiaox.accessrights.pk2.Child2;

public class Child extends Father{
	public static void main(String[] args) {
		Father father = new Father();
		System.out.println(father.param2);
		System.out.println(father.param3);
		System.out.println(father.param4);
		
		Child child = new Child();
		System.out.println(child.param2);
		System.out.println(child.param3);
		System.out.println(child.param4);
		
		Child2 child2 = new Child2();
		System.out.println(child2.param2);
		System.out.println(child.param3);
	}
}
