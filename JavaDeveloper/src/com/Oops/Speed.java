package com.Oops;

public class Speed {
	
	int modelno;
	String cname;
	int sped;
	
	public Speed(int id,String name,int spd) {
		modelno=id;
		cname=name;
		sped=spd;
	}
	
	public void display() {
		System.out.println(modelno+" "+cname+" "+sped);
	}

	public static void main(String[] args) {
  
		//Speed s=new Speed();
		Speed s1=new Speed(12334,"BMW",80);
		s1.display();
		
	}

}
