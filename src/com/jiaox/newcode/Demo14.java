package com.jiaox.newcode;
public class Demo14 {
}
class AA{
	public AA foo(){
		return this;
	}
}
class BB extends AA{
	public AA foo(){
		return this;
	}
}
class CC extends BB{
	/*public void foo(){
	}*/
	/*public int foo(){
		return 1;
	}*/
}
