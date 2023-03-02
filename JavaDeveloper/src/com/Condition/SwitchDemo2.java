package com.Condition;

import java.util.Scanner;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num1");
		int num1=sc.nextInt();
		System.out.println("Enter the num2");
		int num2=sc.nextInt();
		System.out.println("Enter the Operation from following menu");
		System.out.println("+.Addition\n -.substraction \n *.Multiplication \t /.Division");
		char op=sc.next().charAt(0);
		switch(op){
		case '+':System.out.println("Addition= "+(num1+num2));
		break;
		case '-':System.out.println("Substraction= "+(num1-num2));
		break;
		case '/':System.out.println("Division= "+(num1/num2));
		break;
		case '*':System.out.println("Multiplication= "+(num1*num2));
		break;
		default:System.out.println("Invalid Operation");
		
		
		
		
		}

	}

}
