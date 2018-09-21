package com.jiaox.switchdemo;
/**
 * 特点
 * 1.和switch语句结束大括号相邻的break可以省略不写，注意不一定是default 后的break
 * 2.switch语句的所有答案没有固定顺序，可以任意排放，但是执行时肯定是从第一个case执行。
 * 3.switch语句结束，有两种方式：1.执行到break 2.执行到switch语句结束大括号
 * 4.被选择值的类型有限定：只接受byte short int char ,5.0以后接受 enum,7.0以后接受   String
 * 5.当所有case都没有匹配时，就执行default
 * 6.当匹配的case没有对应的break，那么switch语句会继续执行下面可以执行的代码，不会再判断其他的case，
 *   将能执行的代码执行完，知道遇到break，或者执行到switch语句结束
 * @author Administrator
 *
 */
public class TestSwitch {
	public static void main(String[] args) {
		method4();
	}
	
	public static void method1(){

		int x=3;
		switch (x) {
		case 2:
			System.out.println("a");
			break;
		case 1:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
			break;
		default:
			System.out.println("d");
//			break;
		}
	}
	
	public static void method2(){

		int x=3;
		switch (x) {
		default:
			System.out.println("d");
			break;
		case 2:
			System.out.println("a");
			break;
		case 1:
			System.out.println("b");
			break;
		case 3:
			System.out.println("c");
//			break;
		
		}
	}
	
	public static void method3(){

		int week=3;
		switch (week) {
		
		case 1:
			System.out.println("星期一");
//			break;
		case 2:
			System.out.println("星期二");
//			break;
		case 3:
			System.out.println("星期三");
//			break;
		default:
			System.out.println("没有星期");
			break;
		}
	}
	
	/**
	 * 应用，判断月份
	 */
	public static void method4(){

		int month=3;
		switch (month) {
		
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		default:
			System.out.println("不存在");
			break;
		}
	}
	
}
