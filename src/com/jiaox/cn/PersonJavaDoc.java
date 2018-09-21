package com.jiaox.cn;

/**
 * Title: PersonJavaDoc<br>
 * Description: 通过PersonJavaDoc类来说明Java中的文档注释<br>
 * Copyright:(c) 2004 www.sun.com.cn<br>
 * Company : sun java <br>
 * 
 * @author lixinghua
 * @version 1.00
 */
public class PersonJavaDoc {
	private String name = "Careers";
	private String sex = "male";
	private int age = 30;

	/**
	 * 这是PersonJavaDoc对象无参数的构造方法
	 */
	public PersonJavaDoc() {
	}

	/**
	 * 这是PersonJavaDoc类的有参构造方法
	 * 
	 * @param name
	 *            PersonJavaDoc的名字
	 * @param sex
	 *            PersonJavaDoc的性别
	 * @param age
	 *            PersonJavaDoc的年龄
	 */
	public PersonJavaDoc(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	/**
	 * 这是设置name的值的方法，将参数name的值赋给变量this.name
	 * 
	 * @param name
	 *            PersonJavaDoc的名字
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 这是取得name的值的方法
	 * 
	 * @return name的值
	 */
	public String getName() {
		return name;
	}

	/**
	 * 这是取得age的值的方法
	 * 
	 * @return age的值
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 这是设置sex的值的方法，将参数sex的值赋给变量this.sex
	 * 
	 * @param sex
	 *            PersonJavaDoc的性别
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * 这是取得sex的值的方法
	 * 
	 * @return sex的值
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * 这是设置age的值的方法
	 * 
	 * @param age
	 *            PersonJavaDoc的年龄
	 */
	public void setAge(int age) {
		if (age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	public void shout() {
		System.out.println("我是 " + name + "，我性别 " + sex + "，今年 " + age + " 岁！");
	}
}
