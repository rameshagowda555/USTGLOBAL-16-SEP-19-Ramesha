package com.ustglobal.collectionframework.list1nov41019;

import java.util.ArrayList;
import java.util.List;

public class Testk {
	public static void main(String[] args) {
		
		ArrayList<Double> al = new ArrayList<Double>();
		al.add(34.5);
		al.add(23.43);
		al.add(23.45);
		al.add(87.34);
		al.add(12.4);
		al.add(34.5);//allows duplicate
		al.add(null);//allows multiple values
		al.add(null);
		
		System.out.println(al);
		
		al.add(2, 54.6);//list based on index
		System.out.println("After add in 2nd index"+al);
		
		al.remove(0);
		System.out.println("After remobing a oth index"+al);
		
		al.remove(null);
		System.out.println("After removing a null"+al);
		
		Double val = al.get(4);
		System.out.println("Object at 4th index is = "+val);
		
		al.set(2, 77.77);
		System.out.println("After replaceing a 2nd index"+al);
		
		al.clear();
		System.out.println("After clear method");
		al.contains(54.6);
		
		System.out.println("==================================");
		
		List<Double> al1 = new ArrayList<>();
		al1.add(12.3);
		al1.add(23.4);
		al1.add(34.5);
		
		al.addAll(al1);
		System.out.println("After add al1 to al = "+al);
		
		boolean contain = al.containsAll(al1);
		System.out.println("Contains all = "+contain);
		
		System.out.println("Before remove"+al);
		boolean res = al.removeAll(al1);
		System.out.println("Removed all of al1 = "+res);
		System.out.println("After remove"+al);
		
	}
}
