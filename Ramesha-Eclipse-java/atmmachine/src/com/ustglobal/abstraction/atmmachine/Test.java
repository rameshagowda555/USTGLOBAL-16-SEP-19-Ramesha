package com.ustglobal.abstraction.atmmachine;

public class Test {
	public static void main(String[] args) {
		
		Machine m = new Machine();
		
		HDFC hdfc = new HDFC();
		m.slot(hdfc);
		System.out.println("*****************************");
		
		ICICI icici = new ICICI();
		m.slot(icici);
		System.out.println("*****************************");
		
		SBI sbi = new SBI();
		m.slot(sbi);
		
	}
}
