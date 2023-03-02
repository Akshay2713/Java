package com.Oops;

public class Car {
	
	int carId;
	String carName="";
	double price;
	String colour;
	public void createCar() {
		 carId=101;
		 carName="BMW";
		 price=340000.00;
		 colour="blue";
		 System.out.println(carId+" "+carName+" "+price+" "+colour);

		 carId=102;
		 carName="Mercedes Benz";
		 price=3400000.00;
		 colour="Magic Black";
		 System.out.println(carId+" "+carName+" "+price+" "+colour);
		
	}
	public static void main(String[] args) {
		Car c=new Car();
		c.createCar();
		

	}

}
