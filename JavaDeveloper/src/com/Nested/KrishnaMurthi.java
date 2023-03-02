package com.Nested;

import java.util.Scanner;

public class KrishnaMurthi {

	public static void main(String[] args) {
		
		Scanner cs=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=cs.nextInt();
		
		int temp=num;
		int sum=0;
		while(num>0) {
			int digit=num%10;
			int fact=1;
			
			for(int i=1; i<=digit;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		num=temp;
		if(sum==num) {
			System.out.println("Number is krishnamurthy number");
		}else {
			System.out.println("Not a krishna murthy number");
		}
		

	}

}
