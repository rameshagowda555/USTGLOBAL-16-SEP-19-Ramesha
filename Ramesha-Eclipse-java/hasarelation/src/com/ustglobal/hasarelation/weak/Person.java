package com.ustglobal.hasarelation.weak;

public class Person {
	String name= "Ramesha";
	Marker m = new Marker();//Aggregation
	void sleep() {
		System.out.println("sleep() of person");
	}
	void eat() {
		System.out.println("eat() method of person");
	}
}
