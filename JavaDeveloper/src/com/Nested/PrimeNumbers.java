package com.Nested;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		int start=1;
		int end=10;
		for(int i=start;i<=end;i++) {
			
			boolean isPrime=true;
			
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime && i !=1) {
				System.out.println(i);
			}
		}

	}

}
