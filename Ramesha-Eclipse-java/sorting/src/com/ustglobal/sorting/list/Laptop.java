package com.ustglobal.sorting.list;

public class Laptop implements Comparable<Laptop> {
	
	double price;
	int ram;
	String name;
	
	public Laptop(double price, int ram, String name) {
		super();
		this.price = price;
		this.ram = ram;
		this.name = name;
	}

//	@Override
//	public int compareTo(Laptop lp) {
//		Integer i = this.ram;
//		Integer j = lp.ram;
//		return i.compareTo(j);
//	}
//	@Override
//	public int compareTo(Laptop lp) {
//		Double i = this.price;
//		Double j = lp.price;
//		return i.compareTo(j);
//	}
	
	@Override
	public int compareTo(Laptop lp) {
		String p = this.name;
		String q = lp.name;
		return p.toUpperCase().compareTo(q.toUpperCase());
	}
	

	
	
	
	
}
