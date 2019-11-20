package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		
		Student s1 = new Student(12,"dimple",95.6);
		Student s2 = new Student(2,"Sweety",30.6);
		Student s3 = new Student(32,"jimmy",88.96);
		Student s4 = new Student(43,"Tummy",75.5);
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		displayStudentDetails(al);
		
		
		Collections.sort(al);//provide implementaion for compareTo() method present in a Comparable interface
		System.out.println("After sorting = "+al);
		
		System.out.println("--------------------------------------------");
		displayStudentDetails(al);
	
	}
	
	static void displayStudentDetails(ArrayList<Student> al) {
		Iterator<Student> i = al.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println("Id is "+s.id);
			System.out.println("NAme is "+ s.name);
			System.out.println("Percentage is "+s.percentage);
			
			System.out.println("--------------------------------");
		}
	}
}
