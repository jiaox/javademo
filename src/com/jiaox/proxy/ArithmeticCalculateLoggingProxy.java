package com.jiaox.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculateLoggingProxy {
	
	//创建要代理的对象
	private ArithmeticCalculate target;
	
	public ArithmeticCalculateLoggingProxy(ArithmeticCalculate target) {
		this.target = target;
	}
	
	public ArithmeticCalculate getLoggingProxy(){
		ArithmeticCalculate proxy = null;
		//代理对象由哪一个类加载器负责加载
		//目标对象的类加载器对象
		ClassLoader loader = target.getClass().getClassLoader();
		//目标对象所实现的接口数组
		Class<?>[] interfaces = target.getClass().getInterfaces();
		//当调用代理对象其中的方法时要执行的代码
		//代理对象调用代理的方法时会调用invoke方法，回调模式
		InvocationHandler h = new InvocationHandler() {
			
			/**
			 * proxy：正在返回的那个代理对象，一般情况下在invoke方法中都不使用该对象
			 * method：正在调用的目标方法
			 * args：调用目标方法时传入的参数
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				//获取方法名
				String methodName = method.getName();
				//日志
				System.out.println("The method "+methodName+" begin with "+Arrays.asList(args));
				//执行目标方法
				Object result = method.invoke(target, args);
				//日志
				System.out.println("The method "+methodName+" end with "+result);
				return result;
			}
		};
		proxy = (ArithmeticCalculate) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}

}
