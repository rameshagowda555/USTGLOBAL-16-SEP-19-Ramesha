package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println("************************");
		for(int num : nums) {
			System.out.println(num);
		}
		
		System.out.println("===================");
		char[] ch = {'a','b','c','d'};
		
		for(int i = 0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("************************");
		for(char c : ch) {
			System.out.println(c);
		}
		
		System.out.println("===================");
		
		byte[] bt = {10,30,50,70,90};
		for(int i=0;i<bt.length;i++) {
			System.out.println(bt[i]);
		}
		System.out.println("*************************");
		for(byte b :bt) {
			System.out.println(b);
		}
		
		System.out.println("===================");
		boolean[] b = {true,false,true,true,false};
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("*************************");
		for(boolean x :b) {
			System.out.println(x);
		}
		
		System.out.println("===================");
		double[] d = {10.0,20.3,30.4,50.67};
		for(int i=0;i<d.length;i++) {
			System.out.println(d[i]);
		}
		System.out.println("*************************");
		for(double d1 :d) {
			System.out.println(d1);
		}
		
		System.out.println("===================");
		String[] name = {"Ramesha","Mahesha","Sowbhagya"};
		for(int i=0;i<name.length;i++) {
			System.out.println(name[i]);
		}
		System.out.println("*************************");
		for(String names :name) {
			System.out.println(names);
		}
		
	}
}
