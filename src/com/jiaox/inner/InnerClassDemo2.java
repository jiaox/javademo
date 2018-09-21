package com.jiaox.inner;

import com.sun.istack.internal.FinalArrayList;

/**
 * 当内部类定义在局部位置上，如果要访问局部中的变量，该变量必须定义成final
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


