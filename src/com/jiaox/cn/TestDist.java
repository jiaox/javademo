package com.jiaox.cn;

/**
 * 正则表达式
 * @author Administrator
 *
 */
public class TestDist {
	
	public static void main(String[] args) {
		double[] X=new double[12];
		X[0]=80;
		X[1]=81.1124707976416;
		X[2]=82.2249415952831;
		X[3]=87.7872955834909;
		X[4]=88.8997663811325;
		X[5]=88.8997663811325;
		X[6]=90.0122371787741;
		X[7]=91.1135832684392;
		X[8]=91.2804538880855;
		X[9]=93.4008232283903;
		X[10]=98.0554010457225;
		X[11]=100;
		double mean=getMean(X);
		System.out.println("mean:"+mean);
		double sigma=getSigma(X,mean);
		System.out.println("sigma:"+sigma);
		for(int i=0;i<X.length;i++){
			double dist=normDist(X[i],mean,sigma);
			System.out.println("dist"+i+":"+dist);
		}
	}
	
	/**
	 * 获取方差
	 * @param x
	 * @return
	 */
	private static double getSigma(double[] x,double mean) {
		double ret=0;
		double num=0;
		double sum=0;
		for(int i=0;i<x.length;i++){
			sum+=(x[i]-mean)*(x[i]-mean);
			num++;
		}
        ret =Math.sqrt(sum/num);		
		
		return ret;
	}

	/**
	 * 求平均數
	 * @param x
	 * @return
	 */
	private static double getMean(double[] x) {
		double ret=0;
		double sum=0;
		double num=0;
		for(int i=0;i<x.length;i++){
			sum+=x[i];
			num++;
		}
		ret=sum/num;
		return ret;
	}


	private static double normDist(double X,double mean,double sigma)
	{
						// Berechnungsformel wurde von Hans Benz COMIT AG ermittelt
		double res = 0;
		final double x = (X - mean) / sigma;
		if (x == 0){
			res = 0.5;
		}else{
			final double oor2pi = 1 / (Math.sqrt(2 * Math.PI));
//			double t = 1 / (1 + 0.2316419 * Math.abs(x));
//			t *= oor2pi * Math.exp(-0.5 * x * x) *(0.31938153 + t *(-0.356563782 + t *(1.781477937 + t * (-1.821255978 + t * 1.330274429))));
			
//			if (x >= 0){
//				res = 1 - t;
//			}else{
//				res = t;
//			}
			
			res=(1/sigma)*oor2pi*Math.exp(-x*x/2);
		}
		return res;						
	}

}
