package com.ustglobal.abstraction.atmmachine;

public  class HDFC implements ATM {
	
	@Override
	public void validateCard() {
		System.out.println("HDFC card is validated");
	}
	
	@Override
	public void getInfo() {
		System.out.println("Get HDFC card Information");
	}
}
