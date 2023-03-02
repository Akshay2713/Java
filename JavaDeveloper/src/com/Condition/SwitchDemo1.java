package com.Condition;

import java.util.Scanner;

public class SwitchDemo1 {

	public static void main(String[] args) {
		
		//syntax
		//switch(express)//int//char//String//Enum
		//{
		   //case
		   //break
		   //case
		   //break
		//}
      //take day number from user and display dayname
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		switch(num)
		{
		case 1:System.out.println("Monday");
		      break;
		case 2:System.out.println("Tuesday");
		      break;
		case 3:System.out.println("Wednesday");
		      break;
		case 4:System.out.println("Thursday");
		      break;
		case 5:System.out.println("Friday");
		      break;
		case 6:System.out.println("saturday");
		      break;
		case 7:System.out.println("Sunday");
		     
		}
	}

}
