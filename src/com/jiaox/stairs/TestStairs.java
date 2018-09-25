package com.jiaox.stairs;

import java.util.Stack;
/**
 * 一共有n级台阶，每一步最多走m级，且m<==n,问一共有多少种走法
 * @author Administrator
 *
 */


public class TestStairs {
	public static void main(String[] args) {
		method(2, 4);
	}
	
	public static void method(int m,int n){
		int sum=0,//所走台阶总数
		    cnt=0;//走法个数
		if(n<=0){
			System.out.println("就一种，爬上去了");
		}
		if(m<=0){
			System.out.println("你想上是不可能的");
		}
		int i=0;
		Stack<Integer> sk=new Stack<Integer>();
		while(true){
			if(sum<=n){
				++cnt;
				while(sum<=n){
					sk.push(1);
					++sum;
				}
			}
			
			sum-=sk.peek();
			sk.pop();
			while(!sk.empty()&&sk.peek().intValue()==m){
				sum-=sk.peek();
				sk.pop();
			}
			if(!sk.empty()){
				i=sk.peek()+1;
				sum -= sk.peek();
				sk.pop();
				sk.push(i);
				sum+=i;
			}else{
				System.out.println("共有 "+cnt+" 种走法");
				break;
			}
		}
	}
	
}
