package com.jiaox.inner;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 演示匿名内部类
 * @author Administrator
 *
 */
public class NimingInnerClassDemo {
	public static void main(String[] args) {
		new Outer4().method();
	}
}
abstract class AbsDemo2{
	abstract void show1();
	abstract void show2();
}

class Outer4{
	private int num=5;
	
	//将这个类简写成匿名内部类
	/*class Inner extends AbsDemo2{
		@Override
		void show1() {
			System.out.println("show1="+num);
		}

		@Override
		void show2() {
			System.out.println("show2="+num);
		}
	}*/
	
	public void method(){
		/*Inner in =new Inner();
		in.show1();
		in.show2();*/
		//如果要调用多个内部类的方法，可以用父类的引用子类的实现
		AbsDemo2 abs=new AbsDemo2() {
			@Override
			void show2() {
				System.out.println("show1="+num);
			}
			
			@Override
			void show1() {
				System.out.println("show2="+num);
			}
		};
		abs.show1();
		abs.show2();
		
	}
	
	public void function(){
		AbsDemo2 abs=new AbsDemo2() {
			@Override
			void show2() {
				System.out.println("show1="+num);
			}
			
			@Override
			void show1() {
				System.out.println("show2="+num);
			}
			
			public void show3(){
				System.out.println("show3="+num);
			}
		};
		
		abs.show1();
		abs.show2();
//		abs.show3(); 这么写编译错误，因为子类对象提升了父类，编译时期看的引用类型变量所属的类中是否有调用的方法，而AbsDemo2类中没有show3方法
		
		
		//下面写法会编译成功
		new AbsDemo2() {
			@Override
			void show2() {
				System.out.println("show1="+num);
			}
			
			@Override
			void show1() {
				System.out.println("show2="+num);
			}
			
			public void show3(){
				System.out.println("show3="+num);
			}
		}.show3();
		
		
	}
}