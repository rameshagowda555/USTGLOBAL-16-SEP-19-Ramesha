package com.ustglobal.objectclass;

public class TestF {
	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Ramesha",234567);
		Employee e2 = new Employee(102,"Mahesha",123456);
		Employee e3 = new Employee(101,"Ramesha",234567);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
	}
}
