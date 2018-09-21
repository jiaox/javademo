package com.jiaox.cn;

import java.util.Arrays;

public class TestMin {
	 public static void main(String[] args) {
		 double[] zfs=new double[]{60,75,40,30,20,50,79};
		 double min = getMinScore(zfs);
		 double max=getMaxScore(zfs);
		 System.out.println(min);
		 System.out.println(max);
	 }
	 
	 private static double getMinScore(double[] zfs) {
		Arrays.sort(zfs);
		double min = zfs[0];
		for (int i = 0; i < zfs.length; i++) {
			if (zfs[i]>=70) {
				min = zfs[i];
				break;
			}
		}
		return min;
	}
	 
	 private static double getMaxScore(double[] zfs){
		Arrays.sort(zfs);
		double max = zfs[zfs.length-1];
//		for (int i = zfs.length-1; i >=0; i--) {
//			if (zfs[i]<70) {
//				break;
//			}else{
//				max=zfs[i];
//			}
//		}
		return max;
	 }

}
