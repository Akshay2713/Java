package com.Nested;

import java.util.Scanner;

//check the given number is binary or not
public class CheckBinary {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number= ");
		int num=sc.nextInt();
		
		boolean isbinary=true;
		while(num>0) {
			int digit=num%10;
			
			if(digit<0 || digit>1)
			{
				isbinary=false;
				break;
			}
			num=num/10;
		}
		if(isbinary==true) {
			System.out.println("Number is binary");
		}else {
			System.out.println("Not a binary number");
		}

	}

}
