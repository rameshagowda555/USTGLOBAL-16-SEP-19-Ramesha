package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestM {
	public static void main(String[] args) {
		
	System.out.println("============LinkedList=====================");
		
		LinkedList<Employee> li = new LinkedList<Employee>();
		Employee emp1 = new Employee(101, "Ramesha", 233383.56);
		Employee emp2 = new Employee(102, "Priyanka", 321280.22);
		Employee emp3 = new Employee(103, "Arpitha", 212370.42);
		Employee emp4 = new Employee(104, "Harshitha", 321275.52);
		
		li.add(emp1);
		li.add(emp2);
		li.add(emp3);
		li.add(emp4);
		
		System.out.println("============Using for loop===========");
		for (int i1 = 0; i1 < li.size(); i1++) {
			Employee e = li.get(i1);
			System.out.println("Id is "+e.id);
			System.out.println("Name is "+e.name);
			System.out.println("Percentage is "+e.salary+'\n');
		}
		
		System.out.println("============Using for each===========");
		for(Employee e : li) {
			System.out.println(e);
		}
		
		System.out.println("======Using Iterator===========");
		
		Iterator<Employee> it = li.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println(e);
		}
		
		System.out.println("============Using list iterator===========");
		ListIterator<Employee> lt = li.listIterator();
		while(lt.hasNext()) {
			Employee e = lt.next();
			System.out.println(e);
		}
	}
}
