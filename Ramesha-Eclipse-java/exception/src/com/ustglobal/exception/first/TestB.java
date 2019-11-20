package com.ustglobal.exception.first;

public class TestB {
	public static void main(String[] args) {
		System.out.println("Main Started");
		int a = 10;
		int b = 0;
		try {
			b = a/0;
			System.out.println(b);
			System.out.println("Hello");
			System.out.println("Hello Deepavali");
		}catch(ArithmeticException ae) {
			System.out.println("number is dived by zero");
		}
		
		System.out.println("Main Ended");
	}
}
