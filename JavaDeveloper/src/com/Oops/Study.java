package com.Oops;

import java.util.Scanner;

public class Study {
	
	public void checkPrime(int  num) {
		boolean isPrime=true;
		for(int i=2;i<num;i++) {
			if(num%2==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime==true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a prime");
		}
	}

	public static void main(String[] args) {
		Study st=new Study();
		
		Calculation c=new Calculation();//called method from calculation class
		int x=c.addition(7, 6);
		System.out.println(x);
		//st.checkPrime(11);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  number= ");
		int num=sc.nextInt();
		st.checkPrime(num);

	}

}
