package com.Oops;

public class Employee {
	
	int id;
	String name;
	boolean ischeck;

	public static void main(String[] args) {
		
		/*
		 * int x;system.out.println(x);
		 */
		
		
		Employee emp;
		emp=new Employee();
		
		System.out.println(emp.id);
		System.out.println(emp.name);
		//System.out.println(emp.ischeck);
		
		emp.id=101;
		emp.name="Amit";
		System.out.println(emp.id+" "+emp.name);
		
		Employee emp2=new Employee();
		System.out.println(emp2.id+" "+emp2.name);
		
		emp2.id=200;
		emp2.name="Yash";
		System.out.println(emp2.id+" "+emp2.name);
		

	}

}
