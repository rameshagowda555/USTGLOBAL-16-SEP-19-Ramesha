package com.ustglobal.accessmodifiers.pkg2;

public class Run {
	public static void main(String[] args) {
		Demo d = new Demo();
//		System.out.println(d.a); private members can not access outside the class
//		d.add();
		System.out.println(d.b);
		d.sub();//default members can be access inside same package
		
		System.out.println(d.c);
		d.mul();// protected members can access within the same package 
		
		System.out.println(d.name);
		d.div();//public members can be access with in the same package
	}
}
