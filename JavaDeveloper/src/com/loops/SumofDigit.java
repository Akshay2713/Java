package com.loops;

import java.util.Scanner;

public class SumofDigit {

	public static void main(String[] args) {
		
		//find the sum of the digit from the number
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0)
		{
			int remainder=num%10;
			sum=sum+remainder;
			num=num/10;
		}
		System.out.println(sum);

	}

}
