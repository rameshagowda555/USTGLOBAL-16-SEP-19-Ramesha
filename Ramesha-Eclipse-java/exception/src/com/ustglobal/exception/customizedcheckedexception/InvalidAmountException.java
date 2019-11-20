package com.ustglobal.exception.customizedcheckedexception;

public class InvalidAmountException extends Exception{

	private String message = "Daily limit is 49000";
	
	@Override
	public String getMessage() {
		return message;
	}
}
