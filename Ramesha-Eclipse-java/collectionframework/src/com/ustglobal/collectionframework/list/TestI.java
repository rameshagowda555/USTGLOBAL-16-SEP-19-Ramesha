package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class TestI {
	public static void main(String[] args) {
		
		Stack s1 = new Stack();
		s1.add(12);
		s1.add(true);
		s1.add("Ramesha");
		s1.add(null);
		s1.add(23.43);

		System.out.println("========using forloop============");
		for(int i = 0 ;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}

		System.out.println("====using foreach=========");
		for(Object object: s1) {
			System.out.println(s1);
		}

		System.out.println("=======using iterator============");
		Iterator it = s1.iterator();
		while(it.hasNext()) {
			Object o = it.next();
			System.out.println(o);
		}

		System.out.println("============using ListIterato forwardr===========");
		ListIterator lt = s1.listIterator();
		while(lt.hasNext()) {
			Object o = lt.next();
			System.out.println(o);
		}

		System.out.println("===========using listiterator backword=================");
		while(lt.hasPrevious()) {
			Object o = lt.previous();
			System.out.println(o);
		}
	}
}
