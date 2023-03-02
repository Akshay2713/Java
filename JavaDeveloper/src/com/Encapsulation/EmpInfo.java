package com.Encapsulation;

public class EmpInfo {

	public static void main(String[] args) {
		
		Employee e=new Employee();//can access using the parent class obj
		e.setId(100);
		e.setName("Shubham");
		e.setSalary(75000);
				
				System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary());
	}

}
