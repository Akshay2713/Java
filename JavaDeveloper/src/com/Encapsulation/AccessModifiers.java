package com.Encapsulation;

public class AccessModifiers {
	
	
	private int x =10;	//private instance variable
	int y = 20;
	protected int z =78;
	public int u = 67;
	
	private void myPrivate() {//private method
		System.out.println("yes");
	}

	public static void main(String[] args) {

		AccessModifiers a=new AccessModifiers();
		
		System.out.println(a.x);//accessed private int with obj a
		a.myPrivate();
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.u);

	}

}
