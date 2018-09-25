package com.jiaox.inner;
/**
 * 匿名内部类的使用场景
 * 
 * 当方法的参数是接口数据类型的时候，而且该接口中的方法不超过3个，可以使用匿名内部类作为实际参数进行传递
 * @author Administrator
 *
 */
public class NimingInnerClassDemo2 {
	
/*	static class Inner implements Inter{
		@Override
		public void show() {
			System.out.println("show run");
		}
	}*/
	
	
	public static void main(String[] args) {
//       new Inner().show();//失败的，因为要调用inner 需要外部类的this引用，因为Inner是一个非静态成员，需要被对象调用。
		//可是 main函数式静态的，静态只能访问静态成员。所以被静态方法直接访问的内部类，也必须是静态的
		method(new Inter() {
			@Override
			public void show() {
				System.out.println("show run");
			}
		});
	}
	
	public  static void method(Inter in){
		in.show();
	}
}

interface Inter{
	public void show();
}


