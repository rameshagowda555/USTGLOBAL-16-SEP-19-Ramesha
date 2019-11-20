package com.ustglobal.abstraction.atmmachine;

public class SBI implements ATM {
	
	@Override
	public void validateCard() {
		System.out.println("SBI card is validated");
	}
	
	@Override
	public void getInfo() {
		System.out.println("Get SBI card Information");
	}
}
