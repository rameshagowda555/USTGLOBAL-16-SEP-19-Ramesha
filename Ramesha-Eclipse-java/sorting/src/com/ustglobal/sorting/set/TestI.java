package com.ustglobal.sorting.set;


import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
	public static void main(String[] args) {
		
		SortByName sb= new SortByName();
		SortByPinCode sp = new SortByPinCode();
		SortByMicr sm = new SortByMicr();
		
		
		TreeSet<Bank> ts = new TreeSet<Bank>(sb);//we can pass one reference at a time
		
		Bank b1 = new Bank("SBI",460068,5313434);
		Bank b2 = new Bank("KARNATAKA",571101,4344453);
		Bank b3 = new Bank("HDFC",345345,6425644);
		Bank b4 = new Bank ("CANARA",646341,3456543);
		Bank b5 = new Bank("HDFC",345345,6425644);
		
		ts.add(b1);
		ts.add(b2);
		ts.add(b3);
		ts.add(b4);
		ts.add(b5);
		
		
		System.out.println("*************USing iterator*******************");
		Iterator<Bank> it = ts.iterator();
		while(it.hasNext()) {
			Bank b = it.next();
			System.out.println("Bank Name is = "+b.name);
			System.out.println("Bank pincode is = "+b.pincode);
			System.out.println("Bank MICR is = "+b.micr);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
		
	}
}
