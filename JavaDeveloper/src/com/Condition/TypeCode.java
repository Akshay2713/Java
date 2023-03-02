package com.Condition;

public class TypeCode {

	public static void main(String[] args) {
		 
		//type cast
		//when we covert it from lower to higher then it convert in implicit
		//when we convert it from higher to lower then data loss can be happen 
		//and to avoid we have to do explicit casting;
		int x=10;
		double d=x;
		System.out.println(d);
		
		double d2=89.56;
		int y=(int) d2;
		System.out.println(y);

	}

}
