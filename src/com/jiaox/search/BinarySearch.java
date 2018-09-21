package com.jiaox.search;

/**
 * 二分查找实现类
 * 
 * @author jiaox
 * 
 */
public class BinarySearch {
	/**
	 * 循环实现二分查找算法
	 * 
	 * @param arr
	 *            已排好序的数组
	 * @param x
	 *            需要查找的值
	 * @return 返回索引或者-1
	 */
	public static int binarySearch(int[] arr, int x) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int middle = (low + high) / 2;
			if (x == arr[middle]) {
				return middle;
			} else if (x < arr[middle]) {
				high = middle - 1;
			} else {
				low = middle + 1;
			}
		}
		return -1;
	}

	/**
	 * 递归实现二分查找
	 * 
	 * @param dataset
	 *            已排序好的数组
	 * @param data
	 *            需要查找的值
	 * @param beginIndex
	 *            查找起始索引
	 * @param endIndex
	 *            查找结束索引
	 * @return 返回索引值 或者-1
	 */
	public static int binarySearch(int[] dataset, int data, int beginIndex,
			int endIndex) {
		int midIndex = (beginIndex + endIndex) / 2;
		if (data < dataset[beginIndex] || data > dataset[endIndex]
				|| beginIndex > endIndex) {
			return -1;
		}
		if (data < dataset[midIndex]) {
			return binarySearch(dataset, data, beginIndex, midIndex - 1);
		} else if (data > dataset[midIndex]) {
			return binarySearch(dataset, data, midIndex + 1, endIndex);
		} else {
			return midIndex;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 7, 13, 35, 80, 93, 99, 180, 561 };
		System.out.println("循环查找，查询结果索引：" + (binarySearch(arr, 93)));
		System.out.println("递归查找，查询结果索引："
				+ binarySearch(arr, 93, 0, arr.length - 1));
	}

}
