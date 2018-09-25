package com.jiaox.collectiondemo.list;

import java.util.LinkedList;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * 通过LinkedList模拟一个堆栈或者队列数据结构
 * 
 * 应该对队列或堆栈这种数据结构，进行描述，封装成对象，方便其他调用者使用
 * 内部使用LinkedList实现即可
 * @author Administrator
 *
 */
public class LinkedListDemo {
	public static void main(String[] args) {
		DuiLie duiLie = new DuiLie();
		duiLie.myAdd("abc1");
		duiLie.myAdd("abc2");
		duiLie.myAdd("abc2");
		duiLie.myAdd("abc2");
		duiLie.myAdd("abc2");
		while (!duiLie.isNull()) {
			System.out.println(duiLie.myGet());
		}
	}
}

//队列对象
class DuiLie{
	private LinkedList link;
	public DuiLie() {
		link=new LinkedList();
	}
	
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	
	public Object myGet(){
		return link.removeLast();
		
	}
	//判断是否为空
	public boolean isNull(){
		return link.isEmpty();
	}
}

