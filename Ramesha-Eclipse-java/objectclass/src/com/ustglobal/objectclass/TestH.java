package com.ustglobal.objectclass;

public class TestH {
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		Person p1 = new Person(10,"Ramesha");
		
		System.out.println("p1 id is = "+p1.id);
		System.out.println("p1 name is = "+p1.name);
		
		Object o = p1.clone();//it create a exact copy of the current Object
		Person p2 = (Person)o;//Down Casting
		
		System.out.println("p2 id is = "+p2.id);
		System.out.println("p2 name is = "+p2.name);
		
		p2.id = 200;
		p2.name = "Mahesha";
		System.out.println("------------------After Cloning----------------");
		System.out.println("p1 id is = "+p1.id);
		System.out.println("p1 name is = "+p1.name);
		System.out.println("p2 id is = "+p2.id);
		System.out.println("p2 name is = "+p2.name);
	}
}
