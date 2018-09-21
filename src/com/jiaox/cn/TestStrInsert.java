package com.jiaox.cn;
/**
 * 测试字符串中添加字符
 * @author Administrator
 *
 */
public class TestStrInsert {
     public static void main(String[] args) {
		String str1="201611";
		StringBuffer sb=new StringBuffer(str1);
		sb.insert(4, '/');
		String str2=sb.toString();
		System.out.println(str2);
	}
}
