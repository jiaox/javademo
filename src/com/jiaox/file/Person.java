package com.jiaox.file;

import java.io.Serializable;

public class Person	implements	Serializable {
	private String name ;
	private String age ;
	public Person(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return " 姓名： "+this.name+", 年龄："+this.age;
	}
	
}
