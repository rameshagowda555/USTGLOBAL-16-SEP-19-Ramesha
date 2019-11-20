package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(23);
		al.add(89.23);
		al.add(true);
		al.add("Good evening");
		
		
		
		Iterator it = al.iterator();
		Object obj1 = it.next();
		System.out.println("obj1"+obj1);
		
		Object obj2 = it.next();
		System.out.println("obj2"+obj2);
		
		Object obj3 = it.next();
		System.out.println("obj3"+obj3);
		
		Object obj4 = it.next();
		System.out.println("obj4"+obj4);
		
		boolean b = it.hasNext();
		System.out.println("HasNext "+b);
		
//		Object obj5 = it.next();
//		System.out.println("obj5"+obj5);
		
		
		System.out.println("========Using For Loop=========");
		for(int i=0;i<al.size();i++) {
			Object o = al.get(i);
			System.out.println(o);
		}
		
		System.out.println("============Using Iterator===============");
		
		ArrayList al1 = new ArrayList();
		al1.add(12);
		al1.add(233.43);
		al1.add("momo");
		al1.add(false);
		
		Iterator it1 = al1.iterator();
		while(it1.hasNext()) {
			Object o = it1.next();
			System.out.println(o);
		}
		
		System.out.println("============Using forloop for Iterator===============");
		
		
		ArrayList al2 = new ArrayList();
		al2.add(12);
		al2.add(233.43);
		al2.add("momo");
		al2.add(false);
		
		Iterator it2 = al1.iterator();
		for(;it2.hasNext();) {
			Object o = it2.next();
			System.out.println(o);
		}
		}
}
