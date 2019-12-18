package com.ustglobal.datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class BubbleSorting {

	public static int[]  bubbleSort(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n-1; i++) 
			for (int j = 0; j < n-i-1; j++) 
				if (arr[j] > arr[j+1]) 
				{ 
					int temp = arr[j]; 
					arr[j] = arr[j+1]; 
					arr[j+1] = temp; 
				} 
		return arr;
	} 
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = scn.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Elements");
		for(int i=0;i<size;i++) {
			arr[i]=scn.nextInt();
		}
		Instant start = Instant.now();
		int[]res= bubbleSort(arr);
		System.out.println("Sorted array"); 
		for (int i=0; i<res.length; ++i) 
			System.out.print(res[i] + " "); 
		System.out.println();
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();//check the time duration
		double seconds = duration/1000;//convert miliseconds to seconds
		System.out.println("bubble sort time: "+seconds+"seconds");

	}

	

}
