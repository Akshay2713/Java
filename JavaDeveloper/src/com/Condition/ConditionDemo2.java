package com.Condition;

import java.util.Scanner;

public class ConditionDemo2 {
	public static void main(String[] args){
		//check num is divisible by 5 or not
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		
		int num=sc.nextInt();
		if(num%5==0){
			System.out.println("num is divisible by 5");
		}
		else {
			System.out.println("Not divisible by 5");
		}
	}

}
