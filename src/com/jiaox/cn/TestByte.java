package com.jiaox.cn;

public class TestByte {
	public static void main(String[] args) {
		test1();
	}
	
	/**
	 * 
	 */
	private static final void test1(){
		byte b1 =3;//3是int类型，在编译时，编译器会判断具体的常量值是否在byte类型范围内，
					//如果在，会自动将其转换为byte类型存储到byte空间中
		byte b2 =2;//2同上
		byte b4 = 3+2;//正确  同上
//		byte b3 =b1+b2; //报错   因为上边的理论只针对常量适用，此处b1和b2是变量，是不确定的，
						//		所以加完的结果有可能超出byte范围，所以默认用int存储
		
		
	}
}
