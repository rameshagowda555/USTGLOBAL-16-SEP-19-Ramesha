package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestB {
	public static void main(String[] args) {
		
		LinkedList<Laptop> l = new LinkedList<Laptop>();
		Laptop lp1 = new Laptop(25000, 4, "HP");
		Laptop lp2 = new Laptop(35000,6,"Dell");
		Laptop lp3 = new Laptop(100000,12,"Mac");
		Laptop lp4 = new Laptop(50000,8,"Asus");
		
		l.add(lp1);
		l.add(lp2);
		l.add(lp3);
		l.add(lp4);
		l.add(new Laptop(45000,10,"Lenova"));
		
		displayLaptopDetails(l);
		
		Collections.sort(l);
		
		System.out.println("==========After sorting========");
		displayLaptopDetails(l);
		
	}
	static void displayLaptopDetails(LinkedList<Laptop> l) {
		Iterator<Laptop> it = l.iterator();
		while(it.hasNext()) {
			Laptop l1 = it.next();
			System.out.println("Brand name is = "+l1.name);
			System.out.println("Price is = "+l1.price);
			System.out.println("Ram is = "+l1.ram);
			System.out.println("----------------------------------");
		}
	}
}
