package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class TestN {
	public static void main(String[] args) {

		System.out.println("============LinkedList=====================");

		Vector<Employee> v = new Vector<Employee>();
		Employee emp1 = new Employee(101, "Ramesha", 233383.56);
		Employee emp2 = new Employee(102, "Priyanka", 321280.22);
		Employee emp3 = new Employee(103, "Arpitha", 212370.42);
		Employee emp4 = new Employee(104, "Harshitha", 321275.52);

		v.add(emp1);
		v.add(emp2);
		v.add(emp3);
		v.add(emp4);

		System.out.println("============Using for loop===========");
		for (int i = 0; i < v.size(); i++) {
			Employee e = v.get(i);
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.salary+'\n');
		}

		System.out.println("============Using for each===========");
		for(Employee e : v) {
			System.out.println(e);
		}

		System.out.println("======Using Iterator===========");

		Iterator<Employee> i = v.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e);
		}

		System.out.println("============Using list iterator===========");
		ListIterator<Employee> l = v.listIterator();
		while(l.hasNext()) {
			Employee e = l.next();
			System.out.println(e);
		}
	}
}
