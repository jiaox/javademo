package com.jiaox.newcode;

import java.util.ArrayList;
import java.util.List;;


public class Demo6 {
	public static void main(String[] args) {
		List<A1> a;
        List list;
//        list = a;   //A对，因为List就是List<?>，代表最大的范围，A只是其中的一个点，肯定被包含在内
        List<B1> b;
//        a = b;      //B错，点之间不能相互赋值
        List<?> qm;
        List<Object> o= new ArrayList<>();
        qm = o;     //C对，List<?>代表最大的范围，List<Object>只是一个点，肯定被包含在内
        List<D> d=new ArrayList<>();
        List<? extends B1> downB;
        downB = d;  //D对，List<? extends B1>代表小于等于B的范围，List<D>是一个点，在其中
        List<?extends A1> downA;
//        a = downA;  //E错，范围不能赋值给点
//        a = o;      //F错，List<Object>只是一个点 和 List<A1> 是不同点
        downA = downB;  //G对，小于等于A的范围包含小于等于B的范围，因为B本来就比A小，B时A的子类嘛
		
	}
}
class A1{
	
}

class B1 extends A1{
	
}

class C extends A1{
	
}

class D extends B1{
	
}