package com.Condition;

import java.util.Scanner;

public class CheckChar {

	public static void main(String[] args) {
		//chech given char is upper or lower
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the char");
	char ch=sc.next().charAt(0);
	
	if(ch>='A'&& ch<='Z')
	{
		System.out.println("entered char is in Upper case");
	}
	else if(ch>='a'&& ch<='z'){
		System.out.println("entered char is lower case");
	}
	else
	{
		System.out.println("char is nor in upper or in lower case");
	}

	}

}
