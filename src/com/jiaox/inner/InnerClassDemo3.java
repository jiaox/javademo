package com.jiaox.inner;
/**
 * 匿名内部类   就是内部类没有名字
 * 
 * 匿名内部类是内部类的一种简化形式
 * 
 * 匿名内部类的前提条件：
 *     内部类必须继承或者实现一个外部接口或者类
 *     
 * 格式  new 父类名 or 接口名 (){
 * 		子类内容
 *	  }
 * 
 * @author Administrator
 *
 */
public class InnerClassDemo3 {
	public static void main(String[] args) {
		new Outer3().method();
	}
}
abstract class AbsDemo{
	abstract void show();
}

class Outer3{
	private int num=5;
	
	//将这个类简写成匿名内部类
	/*class Inner extends AbsDemo{
		@Override
		void show() {
			System.out.println("num="+num);
		}
	}*/
	
	public void method(){
//		new Inner().show();
		//这就是一个匿名内部类 的对象，只是格式上有转变，其实他就是AbsDemo的子类的匿名对象
		new AbsDemo() {
			@Override
			void show() {
				System.out.println("num="+num);
			}
		}.show();
		
	}
}