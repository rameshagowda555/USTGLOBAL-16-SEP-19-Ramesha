package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
	public static void main(String[] args) {
		
		Predicate<Student> p = (s)->
		{
			if(s.percentage>35) {
				return true;//pass
			}else {
				return false;//fail
			}
		};
		
		Student s = new Student(101, "Ramesha", 83.02);
		boolean res = p.test(s);
		System.out.println("Result is = "+res);
		
		
		
		
		
	}
}
