package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		Student s1 = new Student(2,"divya",67.43);
		Student s2 = new Student(5,"bhavya",37.95);
		Student s3 = new Student(12,"navya",47.79);
		Student s4 = new Student(24,"kavya",77.39);
		Student s5 = new Student(1,"ramya",27.84);
		Student s6 = new Student(8,"ambika",97.0);
		Student s7 = new Student(34,"anamika",73.59);
		Student s8= new Student(14,"patrika",69.5);
		Student s9 = new Student(4,"chatrika",56.49);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Student> al1 = new ArrayList<Student>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Student> al2 = new ArrayList<Student>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
		HashMap<String, ArrayList<Student>> hm = new HashMap<String, ArrayList<Student>>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third",al2);
		
		ArrayList<Student> first = hm.get("second");
		
		Iterator<Student> it = first.iterator();
		while(it.hasNext()) {
			Student s = it.next();
			System.out.println("Student Id is = "+s.id);
			System.out.println("Student Name is = "+s.name);
			System.out.println("Student percentage is = "+s.percentage);
			System.out.println("----------------------------------------");
		}
	}
}
