package com.Encapsulation;

public class AccessAnother {

	public static void main(String[] args) {
		
		AccessModifiers m=new AccessModifiers();
		//System.out.println(m.x);//you cant access private int in another class in same or diff package
		//m.myPrivate()//you cant even access private method in another class
		
		System.out.println(m.y);
		System.out.println(m.z);//you can access protected int in another class but in same package but you have declare obj of that protected class
		System.out.println(m.u);
	}
    //we can access the accessmodifier class in same package without importing it
}
