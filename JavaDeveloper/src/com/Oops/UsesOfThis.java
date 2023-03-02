package com.Oops;

class ThisUse3{
	
	public ThisUse3() {
		//this(56);
		System.out.println("Default.....");
	}
	public ThisUse3(int  x) {
		this();
		System.out.println("x= "+x);
	}
}

public class UsesOfThis {

	public static void main(String[] args) {
		
		//ThisUse3 t=new ThisUse3();
		ThisUse3 t2=new ThisUse3(23);
		
		/*ThisUse2 t=new ThisUse2();
		t.show;
		t.display;

	*/
	}
}
