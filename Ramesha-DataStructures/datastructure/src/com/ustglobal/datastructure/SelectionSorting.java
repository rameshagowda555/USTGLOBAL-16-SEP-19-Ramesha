package com.ustglobal.datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class SelectionSorting {
	
	public static int[] selectionSort(int arr[])
	{
		int n = arr.length;

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < n-1; i++)
		{
			// Find the minimum element in unsorted array
			int min_idx = i;
			for (int j = i+1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			// Swap the found minimum element with the first
			// element
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
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
		int[]res= selectionSort(arr); 
		System.out.println("Sorted array"); 
		for (int i=0; i<res.length; ++i) 
			System.out.print(res[i] + " "); 
		System.out.println(); 
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();//check the time duration
		double seconds = duration/1000;//convert miliseconds to seconds
		System.out.println("Selection sort time: "+seconds+"seconds");
	}
	
}