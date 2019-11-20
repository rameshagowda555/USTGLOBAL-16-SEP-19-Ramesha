package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Arpitha");
		al.add("Megha");
		al.add("Sanmathi");
		al.add("Priyanka");
		
		System.out.println("======Using Iterator===========");
		Iterator<String> i = al.iterator();
		while(i.hasNext()) {
			String s = i.next();
			System.out.println(s);
		}
		
		System.out.println("============Using list iterator===========");
		ListIterator<String> l = al.listIterator();
		while(l.hasNext()) {
			String s = l.next();
			System.out.println(s);
		}
		
		System.out.println("======Using for each============");
		for(String n : al) {
			System.out.println(n);
		}
		
		System.out.println("========using forloop============");
		for(int j = 0 ;j<al.size();j++) {
			System.out.println(al.get(j));
		}
	}
}
