package com.ustglobal.lamdaexpression;

public class TestGreet {
	public static void main(String[] args) {
		GreetInterface g = (message)->
							{
								System.out.println("Hello");
								System.out.println(message);
							};
		g.greet("Java");
			
							
							
	}
}
