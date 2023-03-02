package com.loops;
import java.util.*;
public class WhileDemo3 {

	public static void main(String[] args) {
		
		//find the sum of 1st and the last digit from the number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int last=num%10;
		int first=0;
		
		while(num>0)
		{
			first=num%10;
			num=num/10;
		}
		int sum=last+first;
		System.out.println(sum);

	}

}
