package com.jiaox.accessrights.pk2;

import com.jiaox.accessrights.pk1.Child;
import com.jiaox.accessrights.pk1.Father;

public class Stranger2 {
	public static void main(String[] args) {
		Father father=new Father();
		System.out.println("father 实例访问："+father.param3);
		
		Child child = new Child();
		System.out.println("child 实例访问："+child.param3);
		
		Child2 child2 = new Child2();
		System.out.println("child2 实例访问："+child2.param3);
	}
}
