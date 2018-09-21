package com.jiaox.pattern.factory.simple;
/**
 * 消费者
 * @author jiaox
 *
 */
public class Customer {
	public static void main(String[] args) {  
        Factory factory = new Factory();  
        BMW bmw320 = factory.createBMW(320);  
        BMW bmw523 = factory.createBMW(523);  
    } 
}
