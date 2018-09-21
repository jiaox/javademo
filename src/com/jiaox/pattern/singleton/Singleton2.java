package com.jiaox.pattern.singleton;

/**
 * 懒汉式
 * @author Administrator
 *
 */
public class Singleton2 {
	private static Singleton2 singleton = null; 
    //限制产生多个对象
    private Singleton2(){
    }  
    //通过该方法获得实例对象
    public static Singleton2 getSingleton(){
            if(singleton == null){
                   singleton = new Singleton2();
            }
            return singleton;
    }
    
 // 类中其他方法，尽量是static
 	public static void doSomething() {
 		System.out.println("懒汉方法");
 	}
}
