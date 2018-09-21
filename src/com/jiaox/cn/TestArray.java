package com.jiaox.cn;

import java.util.Arrays;

public class TestArray {
	public static void main(String[] args) {
		demo2();
	}

	/**
	 * 数组拷贝
	 */
	public static void demo1() {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 9, 8, 7, 6, 5, 4, 3 };
		System.arraycopy(a1, 0, a2, 0, 3);// 执行数组拷贝操作
		System.out.print("a1 数组中的内容：");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}
		System.out.println();

		System.out.print("a2 数组中的内容：");
		for (int i = 0; i < a2.length; i++) {
			System.out.print(a2[i] + " ");
		}
		System.out.println("\n 数组拷贝完成");
	}

	/**
	 * 数组排序
	 */
	public static void demo2() {
		int a[] = { 4, 32, 45, 32, 65, 32, 2 };
		System.out.print("数组排序前的顺序：");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		Arrays.sort(a); // 数组的排序方法
		System.out.print("\n数组排序后的顺序：");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}
}
