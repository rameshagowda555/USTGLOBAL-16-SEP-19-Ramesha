package com.ustglobal.sorting.list;

import java.util.Stack;

public class TestD {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		s.add(12);
		s.add(23);
		s.push(34);
		s.push(45);
		
		System.out.println("Using get()-------------------");
		for(int i = 0;i<s.size();i++) {
			System.out.println(s.get(i));
		}
		
		int len = s.size();
		
		System.out.println("Using pop()----------------");
		for(int i = 0;i<len;i++) {
			System.out.println(s.pop());
		}
		
	}
}
