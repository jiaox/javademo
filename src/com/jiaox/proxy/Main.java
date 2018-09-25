package com.jiaox.proxy;

/**
 * 通过动态代理，实现日志的打印
 * @author Administrator
 *
 */
public class Main {

	public static void main(String[] args) {
//		ArithmeticCalculate arithmeticCalculate = new ArithmeticCalculateImpl2();
//		int add = arithmeticCalculate.add(10, 5);
//		System.out.println(add);
//		int sub = arithmeticCalculate.sub(10, 5);
//		System.out.println(sub);
		
		//创建被代理的对象
		ArithmeticCalculate arithmeticCalculate = new ArithmeticCalculateImpl();
		//获取代理对象
		ArithmeticCalculate proxy = new ArithmeticCalculateLoggingProxy(arithmeticCalculate).getLoggingProxy();
		proxy.add(10, 5);
		proxy.sub(10, 5);
		proxy.mul(10, 5);
		proxy.div(10, 5);
		
	}
}
