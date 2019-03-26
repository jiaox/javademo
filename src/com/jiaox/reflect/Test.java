package com.jiaox.reflect;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {
	public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		//获取子类
		Class clazz = Class.forName("com.jiaox.reflect.Child");
		//得到父类方法
		Class superClass = clazz.getSuperclass();
		//得到父类非继承的所有方法
		Method[] methods =superClass.getDeclaredMethods();
		//设置私有方法可以被访问
		AccessibleObject.setAccessible(methods, true);
		for(Method m:methods) {
			System.out.println();
			System.out.println("子类调用方法"+m.getName()+"()的调用结果:");
			m.invoke(new Child());
		}
		
		Method[] methods2=clazz.getDeclaredMethods();
		for (Method m2:methods2) {
			System.out.println("----");
			System.out.println("子类调用方法"+m2.getName()+"()的调用结果:");
			m2.invoke(new Child());
		}
	}

}

class Parent {
	Parent() {
		System.out.println("调用父类构造方法");
	}

	private static void staticParent() {
		System.out.println("调用父类静态方法");
	}

	private final void finalParent() {
		System.out.println("调用父类final方法");
	}

	private void printParent() {
		System.out.println("调用父类私有方法");
	}
}

class Child extends Parent {
	public void printChild() {
		System.out.println("调用子类公有方法");
	}
}