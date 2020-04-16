package com.ustglobal.datastructure;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String args[])  
	  { 
		Instant start = Instant.now();
		countingDuration();
		Instant end = Instant.now();
		Long duration = Duration.between(start, end).toMillis();//check the time duration
		double seconds = duration/1000;//convert miliseconds to seconds
		System.out.println("Linear Search time: "+seconds+"seconds");
	  }
	
	public static void countingDuration() {
		 int c, n, search, array[];  
		   
		    Scanner in = new Scanner(System.in);  
		    System.out.println("Enter number of elements");  
		    n = in.nextInt();   
		    array = new int[n];  
		   
		    System.out.println("Enter those " + n + " elements");  
		   
		    for (c = 0; c < n; c++)  
		      array[c] = in.nextInt();  
		   
		    System.out.println("Enter value to find");  
		    search = in.nextInt();  
		   
		    for (c = 0; c < n; c++)  
		    {  
		      if (array[c] == search)     /* Searching element is present */  
		      {  
		         System.out.println(search + " is present at location " + (c + 1) + ".");  
		          break;  
		      }  
		   }  
		   if (c == n)  /* Element to search isn't present */  
		      System.out.println(search + " isn't present in array.");  
		  }  
	}