package com.jiaox.newcode;
/**
 * 
 * @author Administrator
 *
 */
public class Demo12 {
	public static void main(String[] args) {
		Integer i01 = 59;
		int i02 =59;
		Integer i03 = Integer.valueOf(59);
		Integer i04 = new Integer(59);
		System.out.println(i01==i02);//对象和值比较，对象会自动拆箱，进行值比较
		System.out.println(i01==i03);//这个是对象比较，只不过两个的对象都是取自IntegerCache中，是同一个对象 
		System.out.println(i03==i04);//这两个是对象比较，一个是IntegerCache中的，一个是new的，所以不同
		System.out.println(i02==i04);//值和对象比较，对象自动拆箱，进行值比较。
	}
}
