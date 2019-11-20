package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestJ {
	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		Student s1 = new Student(101, "Ramesha", 83.56);
		Student s2 = new Student(102, "Priyanka", 80.22);
		Student s3 = new Student(103, "Arpitha", 70.42);
		Student s4 = new Student(104, "Harshitha", 75.52);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		System.out.println("============Using for loop===========");
		for (int i = 0; i < al.size(); i++) {
			Student s = al.get(i);
			System.out.println("Id is "+s.id);
			System.out.println("Name is "+s.name);
			System.out.println("Percentage is "+s.percentage+'\n');
		}
		
		System.out.println("============Using for each===========");
		for(Student s : al) {
			System.out.println(s);
		}
		
		System.out.println("======Using Iterator===========");
		Iterator<Student> i = al.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			System.out.println(s);
		}
		
		System.out.println("============Using list iterator===========");
		ListIterator<Student> l = al.listIterator();
		while(l.hasNext()) {
			Student s = l.next();
			System.out.println(s);
		}
	}
}
