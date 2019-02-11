package com.jiaox.inner;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * 崩溃练习：
 * @author Administrator
 *
 */

interface Inter2{
	public void show();
}
class Outer5{
	public static Inter2 method(){
		return new Inter2() {
			public void show() {
				System.out.println("inner ---- show 調用");
			}
		};
	}
	
}
public class NiMingInnerDemo {
	public static void main(String[] args) {
		Outer5.method().show();
	}
}
