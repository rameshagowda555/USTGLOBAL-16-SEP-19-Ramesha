package com.ustglobal.typecasting.reference;

public class TestB {
	public static void main(String[] args) {
	
		Pen p = new Marker();//UPCASTING - we can access only super class members
		p.write();
		System.out.println(p.cost);
//		p.color();   Not possible
//		System.out.println(p.size);  Not possible
		System.out.println("***************");
		
		Marker m = (Marker)p;//DOWNCASTING - we can get both superclass and subclass members
		m.write();
		System.out.println(m.cost);
		m.color();
		System.out.println(m.size);
		
		
	}
	
	
}
