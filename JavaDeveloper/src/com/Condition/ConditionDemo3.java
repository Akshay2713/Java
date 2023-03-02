package com.Condition;

import java.util.Scanner;

public class ConditionDemo3 {

	public static void main(String[] args) {
		//Ladder statements
	//syntax
		//if(condition)
		//{
		//}
		//else if(condition)
		//{
		//}
		//else if(condition)
		//{
		//}
		//else
		//{
		//}
		
		//check given char is Vowel or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the char");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='o'||ch=='i'||ch=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		/*if(ch=='a'){
			System.out.println("Vowel");
		}
		else if(ch=='o'){
			System.out.println("vowel");
		}
		else if(ch=='i'){
			System.out.println("Vowel");
		}
		else if(ch=='e'){
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonants");
		}*/
	}

}
