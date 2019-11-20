package com.ustglobal.sorting.set;

import java.util.HashSet;
import java.util.Iterator;

public class TestB {
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Vijay");
		hs.add("Sujay");
		hs.add("Ajay");
		hs.add("diraj");
		hs.add("enjoy");
		
		System.out.println("*********Using for each**************");
		for(Object o :hs) {
			System.out.println(o);
		}
		
		System.out.println("********Using Iterator*********");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String p =  it.next();
			System.out.println(p);
		}
	}
}
