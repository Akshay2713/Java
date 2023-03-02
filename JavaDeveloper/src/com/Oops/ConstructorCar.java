package com.Oops;

public class ConstructorCar {
	int modelno;
	String cname;
	
	public ConstructorCar()//Default constructor
	{
		System.out.println("I am default costructor");
	}
	
	public ConstructorCar(int cid,String name)//Parameterized Constructor
	{
		modelno=cid;
		cname=name;
	}
	
	public void display()
	{
		System.out.println(modelno+" "+cname);
	}

	public static void main(String[] args) {

		ConstructorCar cc=new ConstructorCar();
		ConstructorCar cc1=new ConstructorCar(12334,"BMW");//you have to add another object if you have  2 constructors in 1 class
			cc1.display();
			
		
	}

}
