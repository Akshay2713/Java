package com.Oops;

public class MethodDemo {
	
	//syntax
	//AccessModifiers return type MethodName
	//{
	
	//statements
	//}
	//1.No return type no parameter
	
	public void show() //method defination //implementation
	{
		System.out.println("Show Method...");
	}
	
	//2. parameter with no return type
	public void addition(int x,int y) {
		int z=x+y;
		System.out.println(z);
	}
	
	//3. Method with return type with no parameter
	
	public String getCity() {
		String city="pune";
		return city;
	}
	
	//4. Return type with parameter
	
	public double areaOfCircle(int r,double PI) {
		double area=PI*r*r;
		return area;
	}

	public static void main(String[] args) {
		MethodDemo m=new MethodDemo();
		m.show();//Method calling
		m.addition(5,7);
		
		String citi=m.getCity();
		System.out.println(citi);
		
		double circle=m.areaOfCircle(7, 3.14);
		System.out.println(circle);
	

	}

}
