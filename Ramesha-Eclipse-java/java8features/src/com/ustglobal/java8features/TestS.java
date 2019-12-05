package com.ustglobal.java8features;

import java.util.ArrayList;

public class TestS {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(5,"vikram",56.7));
		al.add(new Student(6,"vijay",67.8));
		al.add(new Student(3,"yash",50.7));
		al.add(new Student(7,"akshay",65.2));
		al.add(new Student(2,"aishu",30.99));
		al.add(new Student(2,"aishani",90.99));
		al.add(new Student(2,"nithu",28.5));
		
		Helper h = new Helper();
		
		System.out.println("**********Number of Students are*************88");
		h.displayAllStudent(al);
		
		System.out.println("**********Failed Students Are************");
		h.displayFailedStudents(al);

		System.out.println("********************Topper of the class**************");
		h.topperOfTheClass(al);
		
		System.out.println("*****************Lopper of the class****************");
		h.lopperOfTheClass(al);
		
		
	}
}