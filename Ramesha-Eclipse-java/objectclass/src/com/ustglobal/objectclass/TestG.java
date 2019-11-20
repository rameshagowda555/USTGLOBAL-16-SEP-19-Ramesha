package com.ustglobal.objectclass;

public class TestG {
	public static void main(String[] args) {
		Product p1 = new Product(10,"Laptop","ideapad",48000,"Lenova");
		Product p2 = new Product(10,"Laptop","ideapad",48000,"Lenova");
		Product p3 = new Product(20,"Laptop","intelCore",45000,"HP");
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p2.equals(p3));
		
	}
}
