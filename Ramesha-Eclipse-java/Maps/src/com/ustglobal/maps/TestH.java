package com.ustglobal.maps;

import java.util.Hashtable;

public class TestH {
	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer, String>();
		ht.put(101, "ajay");
		ht.put(102,"vijay");
		ht.put(100,"sonu");
		ht.put(99,"monu");
		ht.put(101, "sriram");
		ht.put(102,"vijay");//not allowes duplicate values
		ht.put(22,"vinay");
		ht.put(552,"raj");
		ht.put(1042,"sujay");
		
//		ht.put(null, "john"); NullPointerException
//		ht.put(108, null); Null pointer Exception
		
		System.out.println("Data "+ht);
	}
}
