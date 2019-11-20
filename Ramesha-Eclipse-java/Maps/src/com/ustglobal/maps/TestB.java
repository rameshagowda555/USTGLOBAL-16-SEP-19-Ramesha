package com.ustglobal.maps;

import java.util.HashMap;

public class TestB {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("kuku",741102);
		hm.put("mala", 741166);
		hm.put("sheela", 872254);
		
		HashMap hm1 = new HashMap();
		hm1.put("deepu",123456);
		hm1.put("riya", 456786);
		hm1.put("kriti", 234567);
		
		boolean hasKey = hm.containsKey("mala");//check the key is present or not
		System.out.println("HasKey  "+hasKey);
		
		boolean hasValue = hm.containsValue(872254);//check the value is present or not
		System.out.println("HasValue "+hasValue);
		
		hm.putAll(hm1);//merge two maps
		System.out.println("After put all "+hm);
		
		System.out.println("size of map "+hm.size());//to check the size
		
		boolean isEmpty = hm.isEmpty();
		System.out.println("Map is Empty "+isEmpty);//to check map is empty or not
		
		System.out.println(hm1.isEmpty());
		
		hm.clear();
		System.out.println("After clear "+hm);
	}
}
