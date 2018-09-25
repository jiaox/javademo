package com.jiaox.inner;


/**
 * 面試題
 * @author Administrator
 *
 */
public class NiMingInnerClassDemo3 {
	public static void main(String[] args) {
		new Object(){
			public void method(){
				System.out.println("method run");
			}
		}.method();
		
		/**
		 * 
		 */
		Object obj = new Object(){
			public void method(){
				System.out.println("method run");
			}
		};
//		obj.method();
	}
}
