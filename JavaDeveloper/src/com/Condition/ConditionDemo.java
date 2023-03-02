package com.Condition;

import java.util.Scanner;

public class ConditionDemo {

	public static void main(String[] args) {
	    System.out.println("enter the 1st number");
	    Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("enter the 2nd number");
        int num2=sc.nextInt();
        if(num1>num2){
        	System.out.println("num1 is greater "+num1);
        }
        else {
        	System.out.println("num2 is greater "+num2);
        }
	}

}
