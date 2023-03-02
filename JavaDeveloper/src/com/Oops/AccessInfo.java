package com.Oops;

import com.Encapsulation.AccessModifiers;

public class AccessInfo {

	public static void main(String[] args) {

		AccessModifiers s=new AccessModifiers();
		System.out.println(s.u);//you can access this after importing the package and class 
		//System.out.println(s.y);//you cant access this protected int in another package
		//System.out.println(s.z);
		
		AccessInfo i=new AccessInfo();
		System.out.println(i.z);
		//System.out.println(i.y);
		System.out.println(i.u);
	}

}
