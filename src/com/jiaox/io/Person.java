package com.jiaox.io;

import java.io.Serializable;
/**
 * 类中的静态数据是不会被序列化的，因为它不在对象中。
 * 需求：非静态的数据也不希望被序列化存储，需要transient
 * @author Administrator
 *
 */
public class Person	implements	Serializable {
	private transient String name ;
	private String age ;
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAge() {
		return age;
	}



	public void setAge(String age) {
		this.age = age;
	}



	public String toString(){
		return " 姓名： "+this.name+", 年龄："+this.age;
	}
	
}
