package com.loops;

import java.util.Scanner;

public class Guessingnumber {

	public static void main(String[] args) {
		
		int magicnumber=56;
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter number for guessing");
			int num=sc.nextInt();
			
			if(num>magicnumber)
			{
				System.out.println("number is greater pls try again....");
				continue;
			}
			else if(num<magicnumber)
			{
				System.out.println("number is less pls try again...");
				continue;
			}
			else
			{
				System.out.println("Guessing number is correct.....");
				break;
			}
		}

	}

}
