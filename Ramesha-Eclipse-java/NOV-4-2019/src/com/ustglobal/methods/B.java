package com.ustglobal.methods;

public class B extends A {
	private void m1() {
		System.out.println("m1() method of class B");
	}
	
	public static void main(String[] args) {
//		A ref = new A();
//		ref.m1();
		B ref1 = new B();
		ref1.m1();
	}
}
