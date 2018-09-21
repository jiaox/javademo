package com.jiaox.contest;

public class ContestDemo {
	public static void main(String[] args) {
		/*int x=0,y=1;
		if(++x==y--&x++==1||--y==0){
			System.out.println("x="+x+",y="+y);
		}else{
			System.out.println("y="+y+",x="+x);
		}*/
		
		/*int a=3,b=8;
		int c=(a>b)?a++:b++;
		System.out.println("a="+a+"\tb="+b+"\tc="+c);
		
		int d=(a>b)?++a:++b;
		System.out.println("a="+a+"\tb="+b+"\td="+d);
		
		int e=(a<b)?a++:b++;
		System.out.println("a="+a+"\tb="+b+"\te="+e);
		
		int f=(a<b)?++a:++b;
		System.out.println("a="+a+"\tb="+b+"\tf="+f);*/
		
		/*
		int m=0,n=3;
		if(m>0)
			if(n>2)
				System.out.println("A");
			else
				System.out.println("B");*/
		
		/*int i =0,j=5;
		tp:for(;;){
			i++;
			for(;;){
				if(i>j--)
					break tp;
			}
		}
		System.out.println("i="+i+",j="+j);*/
		
		/*String foo= "blue";
		boolean[] bar =new boolean[2];//默认值为 false
		if(bar[0]){
			foo="green";
		}
		System.out.println(foo);*/
		
		/*int i=4,j=2;
		leftshift(i, j);
		System.out.println(i);*/
		
		/*int [] a = new int [1];//引用类型
		modify(a);
		System.out.println(a[0]);*/
		
		/*String foo =args[1];
		String bar =args[2];
		String baz = args[3];
		System.out.println(baz);*/
		
		/*String s1 = new String();
		String s2= new String("String 2");
		char chars[]={'a',' ','s','t','r','i','n','g'};
		String s3=new String(chars);
		String s4=new String(chars,2,6);
		StringBuffer sb=new StringBuffer(s3);
		String s5 = new String(sb);
		System.out.println("The String NO.1 is "+s1);  //
		System.out.println("The String NO.2 is "+s2);  // String 2
		System.out.println("The String NO.3 is "+s3);  //a string
		System.out.println("The String NO.4 is "+s4);  //string
		System.out.println("The String NO.5 is "+s5); //a string
*/		
		
	/*	
		int i =9;
		switch(i){

		 default:
			 System.out.println("default");
		 case 0:
			 System.out.println("zero");
			 break;
		 case 1:
			 System.out.println("one");
		 case 2:
			 System.out.println("two");
		}
		*/
		
		//下列哪些语句能正确的生成5个空字符串
//		String  a[]=new String [5];
//		for(int i=0;i<5;a[i++]=""){
//			System.out.println(a[i]);
//		}
//		String a[] = {"","","","",""};
//		
//		for(int i=0;i<5;a[i++]=""){
//			System.out.println(a[i]);
//		}
//		String [] a= new String[5];
//		for(int i=0;i<5;a[i++]=null){
//			System.out.println(a[i]);
//		}
		
		
		//下面哪个语句正确的声明一个整型的二维数组
//		int a[][]=new int[][];//no
//		int a[10][10]= new int[][];//no
//		int a[][]=new int[10][10];//yes
//		int [][]a=new int[10][10];//yes
//		int []a[]=new int[10][10];//yes
		
		//计算
//		int a=2,b=3;
//		double x=3.5,y=2.5;
//		System.out.println(x+a%3*(int)(x+y)%2/4);
		
		
		
		
		
		
		
	}
	
	private static void modify(int[] a) {
		a[0]++;
	}

	public static void leftshift(int i,int j){
		i+=j;
	}
	
}
