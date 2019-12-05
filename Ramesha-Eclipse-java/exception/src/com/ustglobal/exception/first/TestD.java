package com.ustglobal.exception.first;

public class TestD {
	public static void main(String[] args) {
		System.out.println("Main Started");
		
		int[] a = {10,20,30};
		int b = 10;
		
		try {

			System.out.println(b/0);
		}catch(ArithmeticException ae) {
			System.out.println("number divided by zero");
		}
		
		try {
			System.out.println(a[2]);
			
		}
		catch(ArrayIndexOutOfBoundsException ab) {
			System.out.println("Array Index is not valid");
		}
		
		System.out.println("main ended");
	}
}