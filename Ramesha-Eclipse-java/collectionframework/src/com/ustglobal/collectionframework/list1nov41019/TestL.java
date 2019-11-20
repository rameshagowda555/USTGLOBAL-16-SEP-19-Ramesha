package com.ustglobal.collectionframework.list1nov41019;

import java.util.Collections;
import java.util.LinkedList;

public class TestL {
	public static void main(String[] args) {
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.add(12);
		l.add(13);
		l.add(43);
		l.add(3);
		l.add(10);
		
		System.out.println("Before sort "+l);
		Collections.sort(l);//always pass generics type and we shold not pass null also and return type  is void
		System.out.println("After sort "+l);
		
		Collections.reverse(l);
		System.out.println("After reverse "+l);//reverse the list and return type  is void
		
		Collections.shuffle(l);
		System.out.println("After Shuffle "+l);
	}
}
