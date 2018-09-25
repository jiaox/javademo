package com.jiaox.inner;

import com.sun.istack.internal.FinalArrayList;

/**
 * 当内部类定义在局部位置上，如果要访问局部中的变量，该变量必须定义成final
 * 因为外部调用局部方法，生成了内部类对象，获得对象的引用，方法执行完后，会出栈，方法中的局部变量会被销毁，
 * 而内部类对象中却还需要调用方法中的局部变量，所以局部中的变量必须声明为final，作为一个常量被调用
 * @author Administrator
 *
 */
class Outer2{
	private int num =6;
	public void method(final int x){
		final int y =9;
		class Inner {
			void show(){
				System.out.println("num="+num);
				System.out.println("y="+y);
				System.out.println("x="+x);
			}
		}
		
		Inner in =new Inner();
		in.show();
	}
}
public class InnerClassDemo2 {
	public static void main(String[] args) {
		new Outer2().method(4);
	}
}


