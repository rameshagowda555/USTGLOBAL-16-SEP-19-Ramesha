package com.ustglobal.accessmodifiers.pkg1;

import com.ustglobal.accessmodifiers.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		Demo d = new Demo();
//		System.out.println(d.a); private members can not access outside the package
//		d.add();
//		System.out.println(d.b);
//		d.sub();//default members can not be access outside the package
		Sample s = new Sample();
		System.out.println(s.c);
		s.mul();// protected members can access within the different packages through 
		        //inheritance by creating a object of subclass 
		
		System.out.println(d.name);
		d.div();//public members can be access with in the same package
	}
}
