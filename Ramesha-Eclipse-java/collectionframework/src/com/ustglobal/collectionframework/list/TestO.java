package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class TestO {
	public static void main(String[] args) {
		
		System.out.println("============LinkedList=====================");

		Stack<Employee> s = new Stack<Employee>();
		Employee emp1 = new Employee(101, "Mahesha", 233383.56);
		Employee emp2 = new Employee(102, "Priya", 321280.22);
		Employee emp3 = new Employee(103, "Anikitha", 212370.42);
		Employee emp4 = new Employee(104, "Harshi", 321275.52);

		s.add(emp1);
		s.add(emp2);
		s.add(emp3);
		s.add(emp4);

		System.out.println("============Using for loop===========");
		for (int i = 0; i < s.size(); i++) {
			Employee e = s.get(i);
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.salary+'\n');
		}

		System.out.println("============Using for each===========");
		for(Employee e : s) {
			System.out.println(e);
		}

		System.out.println("======Using Iterator===========");

		Iterator<Employee> i = s.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e);
		}

		System.out.println("============Using list iterator===========");
		ListIterator<Employee> l = s.listIterator();
		while(l.hasNext()) {
			Employee e = l.next();
			System.out.println(e);
		}
	}
}
