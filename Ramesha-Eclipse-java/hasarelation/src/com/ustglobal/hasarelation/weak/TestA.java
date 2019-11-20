package com.ustglobal.hasarelation.weak;

public class TestA {
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println("Car color is "+c.color);
		c.move();
		System.out.println("============================");
		System.out.println("Music sound is "+c.ms.sound);
		c.ms.play();
	}
}
