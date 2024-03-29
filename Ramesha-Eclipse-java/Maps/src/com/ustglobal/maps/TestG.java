package com.ustglobal.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestG {
	public static void main(String[] args) {
		
		Employee s1 = new Employee(2,"divya",67233.43);
		Employee s2 = new Employee(5,"bhavya",37314.95);
		Employee s3 = new Employee(12,"navya",47455.79);
		Employee s4 = new Employee(24,"kavya",77567.39);
		Employee s5 = new Employee(1,"ramya",24547.84);
		Employee s6 = new Employee(8,"ambika",97554.0);
		Employee s7 = new Employee(34,"anamika",73453.59);
		Employee s8= new Employee(14,"patrika",66759.5);
		Employee s9 = new Employee(4,"chatrika",54356.49);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		ArrayList<Employee> al1 = new ArrayList<Employee>();
		al1.add(s4);
		al1.add(s5);
		al1.add(s6);
		
		ArrayList<Employee> al2 = new ArrayList<Employee>();
		al2.add(s7);
		al2.add(s8);
		al2.add(s9);
		
		
		HashMap<String, ArrayList<Employee>> hm = new HashMap<String, ArrayList<Employee>>();
		hm.put("first", al);
		hm.put("second", al1);
		hm.put("third",al2);
		
		
		System.out.println("********Employees Under First Manager**********");
		System.out.println(" ");
		
		ArrayList<Employee> first = hm.get("first");
		
		Iterator<Employee> it = first.iterator();
		while(it.hasNext()) {
			Employee e = it.next();
			System.out.println("Employee Id is = "+e.id);
			System.out.println("Employee Name is = "+e.name);
			System.out.println("Employee Monthy Salary is = "+e.salary);
			System.out.println("----------------------------------------");
		}
		
		System.out.println(" ");
		System.out.println("********Employees Under Third Manager**********");
		System.out.println(" ");
		
		ArrayList<Employee> third = hm.get("third");
		
		Iterator<Employee> it1 = first.iterator();
		while(it1.hasNext()) {
			Employee e = it1.next();
			System.out.println("Employee Id is = "+e.id);
			System.out.println("Employee Name is = "+e.name);
			System.out.println("Employee Monthy Salary is = "+e.salary);
			System.out.println("----------------------------------------");
		}
	}
}