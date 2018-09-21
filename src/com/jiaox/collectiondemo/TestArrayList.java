package com.jiaox.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * 定义一个功能，去除ArrayList中的重复元素
 * @author Administrator
 *
 */
public class TestArrayList {
	public static void main(String[] args) {

		 ArrayList al=new ArrayList();
		    al.add(new Person("lisi1", 21));
		    al.add(new Person("lisi5", 25));
		    al.add(new Person("lisi3", 23));
		    al.add(new Person("lisi2", 22));
		    al.add(new Person("lisi5", 25));
		    System.out.println(al);
		    
		    al=getSingleElement(al);
		    
		    System.out.println(al);
	
	}
	
	public static void method(){
		 ArrayList al=new ArrayList();
		    al.add("abc1");
		    al.add("abc2");
		    al.add("abc1");
		    al.add("abc3");
		    al.add("abc2");
		    al.add("abc3");
		    System.out.println(al);
		    
		    al=getSingleElement(al);
		    
		    System.out.println(al);
	}
	
	
	public static ArrayList getSingleElement(ArrayList al){
		ArrayList temp = new ArrayList();
		Iterator iterator=al.iterator();
		while(iterator.hasNext()){
			Object obj=iterator.next();
			if(!temp.contains(obj)){
				temp.add(obj);
			}
		}
		return temp;
	}
	
}

class Person{
	private String name;
	private int age;
	public Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	/**
	 * 复写equals
	 */
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if (!(obj instanceof Person)){
			return false;
		}
		Person p=(Person)obj;
		return this.name.equals(p.name)&&this.age==p.age;
	}
	/**
	 * 重写toString
	 */
	public String toString(){
		return this.name+":"+this.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
