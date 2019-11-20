package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestJ {
	public static void main(String[] args) {
		
		CustomerSortByName cs = new CustomerSortByName();
		CustomerSortById cd = new CustomerSortById();
		
		TreeSet<Customer> ts = new TreeSet<Customer>(cs);
		
		Customer c1 = new Customer("Ramesha",101,45000.67);
		Customer c2 = new Customer("Mahesha",103,25000.67);
		Customer c3 = new Customer("Sathisha",102,35000.67);
		Customer c4 = new Customer("Parmesha",104,30000.67);
		
		ts.add(c1);
		ts.add(c2);
		ts.add(c3);
		ts.add(c4);
		
		
		System.out.println("*************USing iterator*******************");
		Iterator<Customer> it = ts.iterator();
		while(it.hasNext()) {
			Customer b = it.next();
			System.out.println("Customer Name is = "+b.name);
			System.out.println("Customer id is = "+b.id);
			System.out.println("Customer salary is = "+b.salary);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	}
}
