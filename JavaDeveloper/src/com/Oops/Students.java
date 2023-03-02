package com.Oops;

public class Students {
	int id;
	String name;
	int marks;
	
	public void acceptDetails(int sid,String sname,int mk) {
		id=sid;
		name = sname;
		marks=mk;
	}
	public void display() {
		System.out.println(id+" "+name+" "+marks+" ");
	}

	public static void main(String[] args) {
		Students s=new Students();
		s.acceptDetails(1, "Mahi007", 78);
		s.display();
	
	}

}
