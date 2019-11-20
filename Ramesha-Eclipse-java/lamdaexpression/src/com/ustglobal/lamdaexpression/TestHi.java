package com.ustglobal.lamdaexpression;

public class TestHi {
	public static void main(String[] args) {
		HiInterface hi = ()->
						{
						System.out.println("hi hello");
						};
		hi.sayHi();				
	}
}
