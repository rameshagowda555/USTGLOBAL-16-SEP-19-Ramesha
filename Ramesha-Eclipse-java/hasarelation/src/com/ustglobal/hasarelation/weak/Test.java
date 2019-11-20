package com.ustglobal.hasarelation.weak;

public class Test {
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Person name is "+p.name);
		p.sleep();
		p.eat();
		System.out.println("=================================");
		
		p.m.write();//Has-A relation(Aggregation/Weak has-a relation)
		System.out.println("Marker color is "+p.m.color);
	}
	
}
