package com.ustglobal.thread.pausing;

public class Counter {
	int v;
	synchronized public void increment() {
		v++;
	}
	synchronized	public void decrement() {
		v--;
	}
	public void showValue() {
		System.out.println("V value is "+v);
	}
}
