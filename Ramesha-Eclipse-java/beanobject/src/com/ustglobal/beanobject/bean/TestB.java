package com.ustglobal.beanobject.bean;

import java.util.Scanner;

public class TestB {
	public static void main(String[] args) {
		
		System.out.println("Scanner Class");
		System.out.println("******************");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println("Age is "+age);
		
		System.out.println("Enter your Full Name");
		String fname = sc.next();
		System.out.println("Name is "+fname);
		
		System.out.println("Enter your Name");
		String name = sc.nextLine();
		System.out.println("Name is "+name);
	}
}
