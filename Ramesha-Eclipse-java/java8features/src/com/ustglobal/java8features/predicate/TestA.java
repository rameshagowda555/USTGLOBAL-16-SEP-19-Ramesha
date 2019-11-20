package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestA {
	public static void main(String[] args) {
		
		Predicate<Employee> p = e->
		{
	
			if(e.salary>30000) {
				return true;
			}else {
				return false;
			}
		};
		Employee e = new Employee(101,"Ramesha",34938.23);
		
		boolean res = p.test(e);
		System.out.println("Employee getting more than 30000 "+res);
	}
}
