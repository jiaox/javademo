package com.jiaox.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ListIteratorDemo {
	public static void main(String[] args) {
		List list =new ArrayList<>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
//		Iterator iterator =list.iterator();
		ListIterator iterator =list.listIterator();
		while(iterator.hasNext()){
			Object object =iterator.next();
			if(object.equals("abc2")){
//				iterator.add("abc9");
				iterator.set("aaaa");
			}
		}
		System.out.println(iterator.hasNext());
		System.out.println(iterator.hasPrevious());
		
		//逆向遍历
		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
			
		}
		
		System.out.println(list);
	}
}
