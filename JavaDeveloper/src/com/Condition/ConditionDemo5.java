package com.Condition;
import java.util.*;
public class ConditionDemo5 {

	public static void main(String[] args) {
        //Nested conditions
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the weight");
		int wt=sc.nextInt();
		
		if(age>18){
			if(wt>=50){
				System.out.println("Eligible for Blood Donation");
			}
			else{
				System.out.println("Weight is less try next time...");
			}
		}
		else{
			System.out.println("Not eligible");
		}

	}

}
