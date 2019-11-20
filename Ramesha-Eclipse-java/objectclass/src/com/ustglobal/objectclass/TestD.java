package com.ustglobal.objectclass;

public class TestD {
	public static void main(String[] args) {
		Car c = new Car(4500000,"Benz","Blue and Black");
		System.out.println(c.hashCode());
		System.out.println(c);
	}
}
