package com.ustglobal.singleton;

public class Test {
	public static void main(String[] args) {
		
		String s1 = "Hello";
		MySingleton ms= MySingleton.getDbConnection();
		ms.s = "Hello";
		System.out.println("HashCode of ms is "+ms.hashCode());
		
		MySingleton mx= MySingleton.getDbConnection();
		mx.s = "Hi";
		System.out.println("HashCode of mx is "+mx.hashCode());
		
		System.out.println(ms.s);
		System.out.println(mx.s);
	}
	
}
