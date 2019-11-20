package com.ustglobal.objectclass;

public class TestB {
	public static void main(String[] args) {
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println("hashCode value of marker is = "+h);
		System.out.println("tostring value of marker is = "+s);
		Marker m1 = new Marker();
		System.out.println(m1);
		
	}
}
