package com.ustglobal.exception.customizeduncheckedexception;

public class TestAge {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		Validator v =new Validator();
		try {
			v.verify(19);
		}catch(InvalidAgeException ie){
			System.out.println("Exception Occured");
		}
		v.verify(15);
		
		System.out.println("Main ended");
	}
}
