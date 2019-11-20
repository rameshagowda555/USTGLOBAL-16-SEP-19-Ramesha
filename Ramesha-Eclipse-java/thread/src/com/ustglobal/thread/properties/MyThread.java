package com.ustglobal.thread.properties;

public class MyThread extends Thread {

	public static void main(String[] args) {
		System.out.println("Main started");
		
		String name = Thread.currentThread().getName();//get the current thread name
		System.out.println("Cureent Thread Name is = "+name);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("MyThread Name is "+mname);
		t1.setName("Lakshman");
		System.out.println("MyThread Name is "+t1.getName());
		
		Thread.currentThread().setName("Ram");//used to set the Thread name
		
		String name1 = Thread.currentThread().getName();//get the current thread name
		System.out.println("Cureent Thread Name is = "+name1);
		System.out.println(10/0);
		
		System.out.println("Main ended");
	}

}
