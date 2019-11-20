package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestD {
	public static void main(String[] args) {
		
		LinkedHashSet<Double> ls = new LinkedHashSet<>();
		ls.add(31.5);
		ls.add(12.34);
		ls.add(98.65);
		ls.add(54.21);
		ls.add(34.45);
	
		
		System.out.println("******using for each**************");
		for(Double d : ls) {
			System.out.println(d);
		}
		
		System.out.println("**************Using iterator*************");
		Iterator<Double> it = ls.iterator();
		while(it.hasNext()) {
			Double p = it.next();
			System.out.println(p);
		}
	}
}
