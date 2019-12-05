package com.ustglobal.java8features;

import java.util.function.Function;

public class TestC {
	public static void main(String[] args) {
		
		Function<Integer, Integer> f = i-> i*i;//it takes one argument and return other than boolean value
		int res = f.apply(5);
		System.out.println("Result "+res);
		
		int res1 = f.apply(4);
		System.out.println("Result "+res1);
		
		int res2 = f.apply(10);
		System.out.println("Result "+res2);
	
	}
}