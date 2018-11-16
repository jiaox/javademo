package com.jiaox.newcode;

/**
 * 测试静态代码块和构造方法加载顺序的
 * @author Administrator
 *
 */
public class Demo1 {

	public static void main(String[] args) {
		new A();
	}

}

class B extends Object{
	static {
		System.out.println("Load B");
	}
	
	public B(){
		System.out.println("Create B");
	}
}

class A extends B{
	static{
		System.out.println("Load A");
	}
	
	public A(){
		System.out.println("Create A");
	}
}