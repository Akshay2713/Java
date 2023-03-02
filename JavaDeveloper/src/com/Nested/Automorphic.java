package com.Nested;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int copy=0;
		int count=0;
		
		while(num>0) {
			count++;
			num=num/10;
		}
		num=copy;
		int square=num*num;
		
		int power=1;
		for(int i=1;i<=count;i++) {
			power=power*10;
		}
		System.out.println(power);
		int end=square%power;
		System.out.println(num + " " + end);
		
		if(num==end) {
			System.out.println("automorphic");
		}else {
			System.out.println("Not automorphic");
		}

	}

}
