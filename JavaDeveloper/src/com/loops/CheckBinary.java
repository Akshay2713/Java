package com.loops;

import java.util.Scanner;

public class CheckBinary {

	public static void main(String[] args) {
		
		//check the given number is binary or not
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter binary number");
		int num=sc.nextInt();
		
		boolean isbinary=true;
		while(num>0)
		{
			int digit=num%10;
			if(digit==0 || digit==1)
			{
				isbinary=false;
				break;
			}
			num=num/10;
		}
		if(isbinary==true)
		{
			System.out.println("Number is binary");
		}
		else {
			System.out.println("Not");
		}

	}

}
