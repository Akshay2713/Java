package com.Condition;

import java.util.Scanner;

public class TernaryDemo {


	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the num1");
	int num1=sc.nextInt();
	
	String ans=(num1>0)?"Positvie":(num1<0)?"Negative":"Zero";
	System.out.println(ans);
	
	/*System.out.println("Enter the num2");
	int num2=sc.nextInt();
	
	String result=(num1>num2)?"num1 is gr":"num2 is gr";
	
	System.out.println(result);
	
	int max=(num1>num2)?num1:num2;
	System.out.println(max);
*/
	}

}
