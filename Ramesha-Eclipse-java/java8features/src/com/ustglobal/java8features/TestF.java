package com.ustglobal.java8features;

import java.util.function.Supplier;

public class TestF {
	public static void main(String[] args) {
		Supplier<Student> s = ()-> new Student(2,"vijay",54.54);//no arguments and it only returns a value
		
		Student s1 = s.get();
		System.out.println("ID is "+s1.id);
		System.out.println("Name is "+s1.name);
		System.out.println("Percentage is "+s1.percentage);
		
		
		Supplier<Integer> i = ()-> 20;
		int val = i.get();
		System.out.println("VAlue is "+ val);
		
		Supplier<String> sp = () -> "Good Evening";
		String v = sp.get();
		System.out.println("Value is "+v);
		
	}
}
