package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestL {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Ramesha", 233383.56);
		Employee e2 = new Employee(102, "Priyanka", 321280.22);
		Employee e3 = new Employee(103, "Arpitha", 212370.42);
		Employee e4 = new Employee(104, "Harshitha", 321275.52);
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println("============Using for loop===========");
		for (int i = 0; i < al.size(); i++) {
			Employee e = al.get(i);
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.salary+'\n');
		}
		
		System.out.println("============Using for each===========");
		for(Employee e : al) {
			System.out.println(e);
		}
		
		System.out.println("======Using Iterator===========");
		Iterator<Employee> i = al.iterator();
		while(i.hasNext()) {
			Employee e = i.next();
			System.out.println(e);
		}
		
		System.out.println("============Using list iterator===========");
		ListIterator<Employee> l = al.listIterator();
		while(l.hasNext()) {
			Employee e = l.next();
			System.out.println(e);
		}
		
	
	}
}
