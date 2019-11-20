package com.ustglobal.exception.customizedcheckedexception;

public class TestAmount {
	public static void main(String[] args) {
		System.out.println("Main started");
		
		ValidateAmount va = new ValidateAmount();
		try {
			va.checkAmount(50000) ;
		}catch(InvalidAmountException e){
			System.err.println(e.getMessage());
		}
		
		
		System.out.println("Main ended");
	}
}
