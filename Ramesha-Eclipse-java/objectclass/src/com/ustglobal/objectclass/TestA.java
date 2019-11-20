package com.ustglobal.objectclass;

public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		int pHashCode = p.hashCode();
		System.out.println("HashCode value of p is "+pHashCode);
		
		Pen q = new Pen();
		int qHashCode = q.hashCode();
		System.out.println("HashCode value of q is "+qHashCode);
	
	}
	
}
