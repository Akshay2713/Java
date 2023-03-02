package com.loops;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st nuber");
		int num1 = sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2 = sc.nextInt();
		System.out.println("1.addition \n.multiplication\n3.substraction\n4.division");
		System.out.println("Enter your choice from above menu");
		int choice = sc.nextInt();
		char ch;

		do {
			switch (choice) {
			case 1:
				System.out.println("Addition= " + (num1 + num2));
				break;
			case 2:
				System.out.println("substraction= " + (num1 - num2));
				break;
			case 3:
				System.out.println("multiplication+ " + num1 * num2);
				break;
			case 4:
				System.out.println("Division= " + num1 / num2);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue...");
			ch = sc.next().charAt(0);
		} while (ch == 'y' || ch == 'Y');

	}

}
