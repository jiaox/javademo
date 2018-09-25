package com.jiaox.collectiondemo;

/**
 * jdk1.5新特性
 * 可变参数
 * 
 * 无论是foreach还是可变参数，都是为了简化书写
 * 
 * 
 * @author Administrator
 *
 */
public class ParameterDemo {
	public static void main(String[] args) {
//		method(3, 4, 5);
//		int []arr={3,4,5};
//		method(arr);
		method(4,5,6,7,9,8);
	}
	
	/**
	 * 注意了，参数列表中，只能定义一个可变参数，而且要定义在参数列表的最后
	 * @param s
	 * @param arr
	 */
	public static void function(String s,int...arr){//这种定义是可以的。
		
	}
	
//	public static void show(int... arr,String s){//这种定义是不可以的，容易出现不确定性
//		
//	}
	
	/**
	 * 对于这种情况，对方调用者在调用method方法之前，必须要先有一个数组，这样比较麻烦
	 * 为了优化，有了一个新特性，就是可变参数。
	 * 
	 * 区别在于：以前要先将运算的数据存储到定义的数组中，然后将数组进行参数的传递
	 * 现在有可变参数以后，不需要定义数组了，直接将需要运算的元素作为参数直接传递给该方法即可。
	 * 其实这些参数还是被封装到了数组当中，只不过这个动作是由系统自动完成，调用者省去了定义数组的动作。
	 * 
	 * @param arr
	 */
	public static void method(int... arr){
		//int...其实就是一个数组类型
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	
	/*public static  void method(int[] arr){
		int sum=0;
		for (int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println(sum);
	}*/
	
	
/*	
	public static void method (int a,int b,int c){
		System.out.println(a+b+c);
	}
	public static void method (int a,int b){
		System.out.println(a+b);
	}*/
}
