package com.Condition;
import java.util.*;
public class CondtionDemo4 {
	public static void main(String[] args){
		//Print the number in word between 1 to 5;
		//Ladder of if else
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number between 1 to 5");
		int num=sc.nextInt();
		
		if(num==1){
			System.out.println("One");
		}
		else if(num==2){
			System.out.println("Two");
		}
		else if(num==3){
			System.out.println("Three");
		}
		else if(num==4){
			System.out.println("Four");
		}
		else if(num==5){
			System.out.println("Five");
		}
		else{
			System.out.println("Invalid number");
		}
	}

}
