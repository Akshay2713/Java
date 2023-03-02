package com.Condition;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the city name");
		String city=sc.next();
		switch(city){
			case "pune":System.out.println("Employee is working in pune location");
			break;
			case "Mumbai":System.out.println("Employee is working in mumbai location");
			break;
			default:System.out.println("Employee is working all over the India");
		}

	}

}
