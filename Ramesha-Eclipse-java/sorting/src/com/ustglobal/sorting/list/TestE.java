package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList<Pen> al = new ArrayList<Pen>();
		
		Pen p1 = new Pen(10.5,"natraja","Black");
		Pen p2 = new Pen(20.3,"cello","Blue");
		Pen p3 = new Pen(05.34,"Reynolds","red");
		Pen p4 = new Pen(25.33,"fine","pink");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
		
		displayPendetails(al);
		
		Collections.sort(al);
		
		System.out.println("After sorting---------------->");
		displayPendetails(al);
		
	
	}
	
	static void displayPendetails(ArrayList<Pen> al) {
		Iterator<Pen> it = al.iterator();
		while(it.hasNext()) {
			Pen p = it.next();
			System.out.println("Brand name is = "+p.brand);
			System.out.println("Price is = "+p.price);
			System.out.println("Color is = "+p.color);
			System.out.println("----------------------------------");
		}
		}
}
