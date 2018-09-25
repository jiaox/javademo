package com.jiaox.basicdatatype;

/**
 * 类的中的基本类型的成员属性可以不指定初始值，会默认有初始值
 * 但是在方法中定义的基本数据类型必须初始化。
 * @author Administrator
 *
 */
public class DemoClass {
	
	public static void main(String[] args) {
		BasicData basicData=new BasicData();
		System.out.println(basicData);
		int i;
		double j;
		long l;
		boolean m;
		short n;
		char o;
		float p;
		byte q;
//		System.out.println(i+","+j+","+l+","+m+","+n+","+o+","+p+","+q);//编译不通过
	}
	

}
class BasicData{
	private int a;
	private String b;
	private long c;
	private double d;
	private float e;
	private char f;
	private short g;
	private boolean h;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public long getC() {
		return c;
	}
	public void setC(long c) {
		this.c = c;
	}
	public double getD() {
		return d;
	}
	public void setD(double d) {
		this.d = d;
	}
	public float getE() {
		return e;
	}
	public void setE(float e) {
		this.e = e;
	}
	public char getF() {
		return f;
	}
	public void setF(char f) {
		this.f = f;
	}
	public short getG() {
		return g;
	}
	public void setG(short g) {
		this.g = g;
	}
	public boolean isH() {
		return h;
	}
	public void setH(boolean h) {
		this.h = h;
	}
	@Override
	public String toString() {
		return "DemoClass [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d
				+ ", e=" + e + ", f=" + f + ", g=" + g + ", h=" + h + "]";
	}
}