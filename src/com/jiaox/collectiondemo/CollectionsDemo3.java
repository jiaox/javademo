package com.jiaox.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.itextpdf.awt.geom.misc.RenderingHints.Key;
import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * Collections中调用二分查找的方法
 * 
 * @author Administrator
 *
 */
public class CollectionsDemo3 {
	public static void main(String[] args) {
		List<String> list =new ArrayList<String>();
		list.add("list1");
		list.add("list2");
		list.add("list3");
		list.add("list4");
		list.add("list5");
		System.out.println(list);
		int index1 = Collections.binarySearch(list, "list8");//如果没有查出，则返回  -插入点-1
		System.out.println("index1="+index1);
		int index = halfSearch(list, "list8");
		System.out.println("index="+index);
		
	}
	
	//对list集合进行折半查找 ，模拟binarySearch
	public static int halfSearch(List<String> list,String key){
		int max,min,mid;
		max=list.size()-1;
		min=0;
		while(min<=max){
			mid=(max+min)>>1;
			String temp=list.get(mid);
			int num=key.compareTo(temp);
			if(num>0)
				min=mid+1;
			else if(num<0)
				max=mid+1;
			else 
				return mid;
		}
		return -min-1;//-插入点-1
	}
	
}
