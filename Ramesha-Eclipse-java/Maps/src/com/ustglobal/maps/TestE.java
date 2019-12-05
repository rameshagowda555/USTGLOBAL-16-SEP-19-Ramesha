package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {
	public static void main(String[] args) {
		

		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Patna",880000);
		tm.put("Bangalore",560068);
		tm.put("Hariyana",134203);
//		tm.put(null, 123456); null pointer exception
		
		
		for(Map.Entry<String, Integer> m :tm.entrySet()) {
			System.out.println("Key is = "+m.getKey());
			System.out.println("Value is = "+m.getValue());
			System.out.println("----------------------------------");
		}
	}
}