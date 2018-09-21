package com.jiaox.cn;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 随机生成6位不重复数字
 * @author Administrator
 *
 */
public class TestRandom {
     public static void main(String[] args) {
    	 Random random = new Random(); 
//         String result="";
//
//         for(int i=0;i<6;i++){
//             result+=random.nextInt(10);    
//         }
//         System.out.print(result);
    	 
    	 Set<String> set = new HashSet<String>();
         for(int i=0;i<100;i++){
             String result="";
             do{
            	
              for(int j=0;j<6;j++){
            	  result+=random.nextInt(10);    
              }
             }while(set.contains(result));
             set.add(result);
          System.out.println(result);
         }
	}
}
