package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TestE {
	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add(34);
		ts.add(45);
		ts.add(12);
		ts.add(9);
		ts.add(39);
		ts.add(9);
//		ts.add("deepika"); classcastException
//		ts.add(null); nullpointerException
		
		System.out.println("**********Using for each*********8");
		for(Object s :ts) {
			System.out.println(s);
		}
		System.out.println("**************Using iterator*************");
		Iterator it = ts.iterator();
		while(it.hasNext()) {
			Object p = it.next();
			System.out.println(p);
		}
	}
}
