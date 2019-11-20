package com.ustgloal.objectarray.assignment;

public class ObjectArray {
	public static void main(String[] args) {
		
		Object[] obj = new Object[10];
		obj[0] = 10;
		obj[1] = 200;
		obj[2] = 4213;
		obj[3] = 4054.233;
		obj[4] = 23.5f;
		obj[5] = 'a';
		obj[6] = true;
		obj[7] = false;
		obj[8] = "Ramesha";
		
		System.out.println("==========Using ForLoop===========");
		for(int i = 0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("=========Using ForEach=============");
		
		for(Object ob : obj) {
			System.out.println(ob);
		}
	}
}
