package com.jiaox.cn;

import java.util.ArrayList;
import java.util.List;

public class TestForEach {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		for(String str:list){
			System.out.println("hh");
		}
	}
}
