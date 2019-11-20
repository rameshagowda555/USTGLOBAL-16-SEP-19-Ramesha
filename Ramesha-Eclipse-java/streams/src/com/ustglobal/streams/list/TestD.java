package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestD {
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(4);
		al.add(56);
		al.add(67);
		al.add(30);
		al.add(5);
		
		List<Integer> l = al.stream().map(i -> i+50 ).collect(Collectors.toList());
		for(Integer i : l) {
			System.out.println(i);
		}
	}
}
