package com.jiaox.collectiondemo;

import java.util.Comparator;
import java.util.TreeSet;


/**
 * 当treeset集合中存储的元素不具备比较功能
 * 或者具备的比较功能不是所需要的
 * 比如Person对象中的自然排序是按照年龄排序，但是现在需求是想按照姓名排序，
 * 改源代码的方式想都不要想
 * 
 * 既然元素具备的比较方式不满足应用
 * 这时可以让集合自身具备比较性
 * 需要集合一初始化，就具备比较功能，因为要在添加元素前具备
 * 就需要在构造函数中进行初始化
 * 只要将一个实现了Compare按投入接口的子类对象作为参数传递给TreeSet的构造函数即可
 * 这样该集合就具备了比较功能
 * 建议使用该排序方式。
 * 
 * 总结：
 * Treeset排序方式有两种
 * 1.让元素自身具备比较性，其实是让元素实现comparable接口，覆盖compareTo方法，称为元素的自然排序
 * 2.当元素不具备比较性，或者元素具备的比较性不是所需的，可以让集合自身具备比较性，定义一个比较器，其实就是定义一个类，实现comparator接口，覆盖compare方法。
 * 当元素自身具备比较性，同时treeset集合也具备比较器，这时以比较器为主
 * 
 * 到了这里
 * 一般在描述一个对象时，如果该对象封装了具体的数据，会出现很多这样的对象，比如：员工，学生对象等。
 * 那么描述该类对象时，就一定要复写几个方法
 * hashCode() ,equals(),toString(),最好实现compareable接口让该类具备自然排序工能。
 * 
 * 建立对象自身判断是否相同的依据，同时让对象具备基本的比较性。
 * @author Administrator
 *
 */
public class TestTreeSet1 {
	
	public static void main(String[] args) {
		TreeSet ts=new TreeSet(new CompareByName());
		ts.add(new Person2("lisi1", 21));
		ts.add(new Person2("lisi4", 29));
		ts.add(new Person2("lisi2", 67));
		ts.add(new Person2("lisi8", 28));
		ts.add(new Person2("lisi0", 20));
		System.out.println(ts);
	}
	

}
class CompareByName implements Comparator{
	public int compare(Object o1,Object o2){
		Person2 p1=(Person2)o1;
		Person2 p2=(Person2)o2;
		int num=p1.getName().compareTo(p2.getName());
		return num==0?p1.getAge()-p2.getAge():num;
	}
}

class Person2 implements Comparable{
	private String name;
	private int age;
	public Person2(String name, int age){
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
		if (!(obj instanceof Person2)){
			return false;
		}
		Person2 p=(Person2)obj;
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

	@Override
	public int compareTo(Object o) {
		Person2 p=(Person2)o;
		int num=this.name.compareTo(p.name);//首先按姓名排序
		
		return num==0?this.age-p.age:num;//如果姓名相同了，再按年龄排序
	}
	
}
