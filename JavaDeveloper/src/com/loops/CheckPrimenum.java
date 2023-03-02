package com.loops;
import java.util.*;
public class CheckPrimenum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num");
		int num=sc.nextInt();
		
		int i=2;
		boolean isprime=true;
		
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				break;
			}
			i++;
		}
		if(isprime==true) {
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not prime");
		}

	}

}
