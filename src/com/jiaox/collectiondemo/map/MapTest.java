package com.jiaox.collectiondemo.map;

import java.util.TreeMap;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * 练习："zaxcvbnasd" 要求：获取该字符串中每一个字母出现的次数，结果 a(2)b(1)c(1)......
 * 
 * Map集合什么时候使用呢
 * 当分析问题是，如果问题中出现了映射关系，这是应该先想到Map集合
 * 
 * 对于这个练习，
 * 分析：要获取每个字符出现的次数，这就说明，字母和期出现的次数有对应关系。
 * 		这时可以使用map集合解决，因为对应关系有很多，所以需要存储。
 * 思路：
 * @author Administrator
 *
 */
public class MapTest {
	public static void main(String[] args) {
		String str="zax-cv+bna*sd";
		getCharCount(str);
	}
	
	public static String getCharCount(String str){
		//定义一个map容器，因为要展现的结果是a(2)b(1)....
		//说明是有序的，所以定义TreeMap
		TreeMap<Character,Integer> tm=new TreeMap<Character,Integer>();
		//获取字符串中的每一个字母，将字符串变成一个字符数组
		char[] arr=str.toCharArray();
		//对数组进行遍历
		for(int x=0;x<arr.length;x++){
			//要对每一个字符都要去集合中进行查找，对应的次数
			//如果不存在，就将该字符和1存入到map中
			//如果存在，就获取该字母对应的次数，并将次数+1后重新将该字母和+1后的次数存到map中
			//怎么判断这个字母作为key是否存在呢。
			//使用getKey(),如果返回null说明字母没有对应的次数
			if(!(arr[x]>='a'&&arr[x]<'z'||arr[x]>='A'&&arr[x]<'Z'))
				continue;
			Integer value=tm.get(arr[x]);
			int count=1;
			if(value!=null){
				count=value+1;
			}
			tm.put(arr[x], count);
			
			/*
			if(value==null){
				tm.put(arr[x], 1);
			}else{
				value=value+1;
				tm.put(arr[x], value);
			}*/
		}
		
		System.out.println(tm);
		return null;
	}
}
