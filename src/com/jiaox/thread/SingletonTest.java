package com.jiaox.thread;
/**
 * 实现线程安全的懒汉式
 *
 * @author Administrator
 *
 */
public class SingletonTest {
	
}
class Bank{
	private Bank(){
		
	}
	private static Bank bank=null;
	
	//方式一
	/*public static synchronized Bank getInstance(){
		if(bank==null){
			bank = new Bank();
		}
		return bank;
	}*/
	
	//方式二 相较于方式一好一点
	public static Bank getInstance(){
		if(bank==null){
			synchronized (Bank.class) {
				if (bank == null) {
					bank = new Bank();
				}
			}
		}
		return bank;
	}
}