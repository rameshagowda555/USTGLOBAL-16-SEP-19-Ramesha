package com.ustglobal.wrapperclasses;

public class TestA {
	public static void main(String[] args) {
	
		int a = 10;
		System.out.println("a is "+a);
		Integer b = a;// Auto Boxing.
		System.out.println("b is "+b);
		 
		Integer c =10;
		Integer d = new Integer(20);
		System.out.println("c is "+c);
		int e = c;// auto unboxing
		System.out.println("e is "+e);
		System.out.println("********************");
		
		int value = Integer.parseInt("123");
		System.out.println("Value is "+value);
		
		boolean result = Boolean.parseBoolean("true");
		System.out.println("Result is "+result);
		
		
		int value1 = Integer.parseInt("123string");//Number Format Exception
		System.out.println("Value is "+value1);
		
		boolean result1 = Boolean.parseBoolean("123true");//Number Format Exception
		System.out.println("Result is "+result1);
		
		
		byte f = 5;
		System.out.println("f is "+f);
		Byte g  = f;// AutoBoxing
		System.out.println("g is "+g);
		
		Byte h = 12;
		System.out.println("h is "+h);
		byte i = h;//auto unboxing
		System.out.println("i is "+i);
		System.out.println("********************");
		
		
		
	}
}
