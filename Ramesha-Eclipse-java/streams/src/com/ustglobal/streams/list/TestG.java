package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestG {
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		Employee e1 = new Employee(101,"Ramesha");
		Employee e2 = new Employee(112,"Meghana");
		Employee e3 = new Employee(104,"Sanmathi");
		Employee e4 = new Employee(108,"Arpitha");
		Employee e5 = new Employee(103,"Harshitha");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		Comparator<Employee> cmp =(emp1,emp2)->
		{
			return emp1.name.compareTo(emp2.name);
		};
		
		List<Employee> li = al.stream().sorted(cmp).collect(Collectors.toList());
		
		System.out.println("-----------Sorted by Names--------------");
		Iterator<Employee> it = li.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Employee Id is = "+e.id);
			System.out.println("Employee Name is = "+e.name);
			System.out.println("--------------------------------");
		}
	}
}
