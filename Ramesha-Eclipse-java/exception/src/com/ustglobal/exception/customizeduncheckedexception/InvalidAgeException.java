package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	
	private String message = "Invalid age below 18years not allowed";
	
	public InvalidAgeException() {
		
	}
	public InvalidAgeException(String message) {
		this.message = message;
	}
	@Override
	public String getMessage() {
		return message;
	}
//	@Override
//	public String toString() {
//		return "InvalidAgeException [message=" + message + "]";
//	}
//	
	
}
