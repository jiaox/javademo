package com.jiaox.biteoperation;

import com.jiaox.thread.DemoThread;
import com.sun.corba.se.impl.orb.ParserTable.TestORBInitializer1;

/**
 * 位运算练习
 * @author Administrator
 *
 */
public class BiteOperation {
	public static void main(String[] args) {
		
		System.out.println(3<<2);//3向左移2位 带符号
		System.out.println(6>>1);//6向右移一位
		System.out.println(-312>>>1);//不带符号的位移
		System.out.println(6&3);//与运算
		System.out.println(6|3);//或运算
		System.out.println(6^3);//异或
		System.out.println(6^3^3);//
		System.out.println(~6);//反码
		
		biteOpDemo1();
	}
	
	/**
	 * 位运算练习1
	 * 最有效率计算2乘以8等于几
	 */
	public static void biteOpDemo1(){
		System.out.println(2<<3);
	}
	
	/**
	 * 位运算练习2
	 * 对两个整数变量的值进行互换（不需第三变量）
	 */
	public static void biteOpDemo2(){
		
	}
	
}
