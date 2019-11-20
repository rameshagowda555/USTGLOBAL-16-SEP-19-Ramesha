package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestF {
	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Ramesha");
		ts.add("Sanmathi");
		ts.add("Megha");
		ts.add("Shivu");
		ts.add("Ranjana");
		ts.add("Ramesha");
		
		System.out.println("**********Using for each*********8");
		for(Object s :ts) {
			System.out.println(s);
		}
		System.out.println("**************Using iterator*************");
		Iterator<String> it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
}
