package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add("Priyanka");
		
		Object o = al.get(0);
		
		String name = (String)o;//DownCasting to access child class specifications
		System.out.println(name);
		
		name = name.toUpperCase();
		System.out.println(name);
	}
}
