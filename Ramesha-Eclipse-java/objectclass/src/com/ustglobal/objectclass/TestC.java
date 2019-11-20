package com.ustglobal.objectclass;

public class TestC {
	public static void main(String[] args) {
		Student s1 = new Student(10,"Ramesha",83.02);
		System.out.println(s1.hashCode());
		System.out.println(s1);//it implicitly calls toString method
		s1.printDetails();
	}
}
