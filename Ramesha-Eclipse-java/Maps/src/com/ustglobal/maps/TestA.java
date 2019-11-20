package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {
	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Ramesha",741102);
		hm.put("Mahesha", 741166);
		hm.put("Sowbhagya", 872254);
		
		
		System.out.println("Data = "+hm);
		hm.put("Ramesha",812345);
		System.out.println("After modify = "+hm);
		
		hm.put("Dimple",81234);
		System.out.println("After Dimple = "+hm);
		
		hm.put(null,456576);
		System.out.println("After null = "+hm);

		hm.put(null,956576);
		System.out.println("After adding duplicate null = "+hm);
		
		
		System.out.println("********************************");
		
		Object phoneno = hm.get("Dimple");
		System.out.println("Value is"+phoneno);
		
		System.out.println("============================");
		
		Object phoneno1 = hm.get("Shivu");
		System.out.println("Value is "+phoneno1);
		
		System.out.println("======================");
		
		Object value = hm.remove("Dimple");
		System.out.println("Value is "+value);
		System.out.println("After remove----------->"+hm);
	}
	
}
