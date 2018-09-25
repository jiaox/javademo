package com.jiaox.inner;

public class InnerClassDemo {
	public static void main(String[] args) {
		Outer.Inner in = new Outer().new Inner();//这种方式可以，但是有点危险，应该封装。
		in.show();
//		Outer.Inner2 in2 =new Outer.Inner2();
//		in2.show();
//		Outer.Inner3.show();
	}
}
/**
 * 演示内部类修饰符
 * 当内部类定义在外部类的成员位置上是，是可以被成员修饰符修饰的
 * 1.默认修饰符，内部类前面没有任何权限，默认权限
 *   在外部其他类中如何访问呢
 *   格式：外部类名.内部类名 变量 = 外部类对象.内部类对象 
 *   但是这种方式，很少见。因为大多数内部类会被封装起来，会被private修饰
 *   因为可以在外部类的方法中创建内部类对象，并将其对外提供
 *   这样可以对内部类对象的创建可控
 *   
 * 2.可以被private修饰，隐藏在外部类中
 * 
 * 3.static，内部类可以被static修饰
 *   直接在外部其他类中访问
 *  格式：外部类名.内部类名 变量 = new 外部类名.内部类名();
 *  
 *   如果是直接访问静态内部类的静态方法呢？
 *   格式 外部类名.内部类名.静态方法。
 *   
 * 注意，如果内部类中定义了静态成员，该内部类也必须是静态的
 *   
 * @author Administrator
 *
 */
class Outer {
	private int num = 4;

	private static int num2=6;
	// 内部类
	class Inner {
		void show() {
			 int num=7;
			System.out.println("num=" + num);//如果没有局部同名变量则等价于System.out.println("num=" + Outer.this.num);
			 System.out.println("num=" + Outer.this.num);
		}
	}
	
	static class Inner2{
		void show(){
			System.out.println("num="+num2);//等价于 System.out.println("num="+Outer.num2);
		}
	}
	
	
	static class Inner3{
		static void show(){
			System.out.println("num="+num2);//等价于 System.out.println("num="+Outer.num2);
		}
	}
	public void method() {
		// 创建一个内部类对象
		Inner in = new Inner();
		in.show();
	}

}
