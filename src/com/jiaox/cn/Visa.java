package com.jiaox.cn;

public class Visa {
	
	public static void main(String[] args) {
		double xuZS=9120.30;
		double xuJT=8607.67;
		double xuJS=2264.74;
		double xuZG=4571.67;
		
		double jiaoJT=7551.39;
		double jiaoZS=8842.20;  
		
		double jiaoPay=7400;  //工资  每月
		double xuPay=3300;   //工资   每月
		
		double shenghuofei=1300+60*30+16*30+0.49*100+10+10;
		System.out.println("生活费:"+shenghuofei);
		
		double store=jiaoPay+xuPay-shenghuofei;
		
		System.out.println("还款金:"+store);
		
		
		double resul=148*0.1+1000+218*0.1+10+403+139.82;
		System.out.println(resul);
		
		int month=0;  //几个月还清
		
		double remain=xuZS+xuJT+xuJS+xuZG+jiaoJT+jiaoZS;
		
		while(remain>0){
            
	
			
			
		}
		
		System.out.println("所需月份:"+month);
		
	
		
		
		
	}
	
	public static long miniPay(long cash){
		long mini=0;
	    mini=cash*5/10000*30;
		
		return mini;
	}
	

}
