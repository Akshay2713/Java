package com.Oops;

public class Calculation {
	
	public int addition(int x,int y) {
		return x+y;
	}
	public void substraction(int x, int y) {
		System.out.println("Substraction= "+(x-y));
	}
	public float multiply(float a,float b) {
		return a*b;
	}
	public void division(int p,int q) {
		System.out.println("Division= "+(p/q));
	}

	public static void main(String[] args) {
		Calculation c=new Calculation();
		
		int add=c.addition(35, 30);
		System.out.println(add);
		
		c.substraction(45, 20);
		
		float multi=c.multiply(3.5f, 2.3f);
		System.out.println(multi);
		
		c.division(96, 32);

	}

}
