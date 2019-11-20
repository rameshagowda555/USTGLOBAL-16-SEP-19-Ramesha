package com.ustglobal.abstraction.atmmachine;

public class ICICI implements ATM {
	
	@Override
	public void validateCard() {
		System.out.println("ICICI card is validated");
	}
	
	@Override
	public void getInfo() {
		System.out.println("Get ICICI card Information");
	}
}
