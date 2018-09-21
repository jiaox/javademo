package com.jiaox.cn;

public class Testpage {
   public static void main(String[] args) {
	    int begin=1;
	    int end=3;
	    int temp=2;
	    int currentPage=4;
	    int totalPage=6;
	    
	    if(currentPage!=totalPage&&currentPage!=1){//当前页不是首页和尾页。
	    	 if(currentPage>=end){//选择下一页
		    	 begin=end;
			     if(begin+temp>totalPage){
		    	     end=totalPage;
		         }else{
		        	 end=begin+temp;
		         }
		     }else if(begin!=1&&end!=totalPage){
		    	 end=begin;
		    	 begin=end-temp;
		     }else if(end==totalPage){
		    	 if(currentPage<begin){
		    		 end=begin;
			    	 begin=end-temp;
		    	 }
		     }
	     }
	    
	    System.out.println("begin:"+begin+";end:"+end);
   }
}
