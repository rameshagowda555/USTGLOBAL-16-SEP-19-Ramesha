package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50};
//		System.out.println(nums[10]);ArrayIndexOutOfBoundsException
		receive(nums);
		
		System.out.println("====================");
		
		int[] res = getArray();
		for(int i : res) {
			System.out.println(i);	
		}
		
		System.out.println("====================");
		
		String[] str = {"Ramesha","Mahesha","Sowbhagya"};
		receiveString(str);
		
		System.out.println("============================");
		String[] ans = getString();
		for(String a :ans) {
			System.out.println(a);
		}
		
	}
	
	static void receive(int[] numbers) {
	//for(dataType localVariable:Arrayname/collection name){}
		for(int num : numbers) {
			System.out.println(num);
		}
	}
	
	static int[] getArray() {
		int[] values = {20,30,40,50,60};
		return values;
	}
	
	static void receiveString(String[] res) {
		for(String str : res){
			System.out.println(str);
		}
	}
	static String[] getString() {
		String[] str = {"Ramesha","Mahesha","Sowbhagya"};
		return str;
	}
}
