package com.ustglobal.sorting.list;

public class Pen implements Comparable<Pen> {
	double price;
	String brand;
	String color;
	
	public Pen(double price, String brand,String color) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
	}
//	@Override
//	public int compareTo(Pen p) {
//		String a = this.brand;
//		String b = p.brand;
//		return a.toUpperCase().compareTo(b.toUpperCase());
//	}
	
//	@Override
//	public int compareTo(Pen p) {
//		String a = this.color;
//		String b = p.color;
//		return a.toUpperCase().compareTo(b.toUpperCase());
//	}
	@Override
	public int compareTo(Pen p) {
		if(this.price>p.price) {
			return 1;
		}else if(this.price<p.price) {
			return -1;
		}
		return 0;
	}
	
	
	
}
