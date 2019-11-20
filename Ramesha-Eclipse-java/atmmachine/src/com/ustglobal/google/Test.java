package com.ustglobal.google;

public class Test {
	public static void main(String[] args) {
		Browser b = new Browser();
		
		Google g = new Gmail();
		b.open(g);
		
		System.out.println("**************************88");
		Google gb = new GoogleDrive();
		b.open(gb);
	}
}
