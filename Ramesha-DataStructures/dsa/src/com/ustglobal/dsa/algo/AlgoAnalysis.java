package com.ustglobal.dsa.algo;

import java.time.Duration;
import java.time.Instant;

public class AlgoAnalysis {
	public static void main(String[] args) {
		countingDuration1();
		countingDuration2();
//		System.out.println(addUpto(number));
//		System.out.println(addUptoQuick(number));
	}
	
	public static long addUpto(long number) {
		long total =0l;
		for(long i=0;i<=number;i++) {
			total=total+i;
		}
		return total;
	}
	
	public static long addUptoQuick(Long number) {
		return number*(number+1)/2;
	}
	
	public static void countingDuration1() {
		long number = 9999999999l;
		Instant start = Instant.now();//record the start time
		System.out.println("addUpTo: "+addUpto(number));
		Instant end = Instant.now();//record the end time
		Long duration = Duration.between(start, end).toMillis();//check the time duration
		double seconds = duration/1000;//convert miliseconds to seconds
		System.out.println("addUpto time "+seconds+"seconds");
	}
	
	public static void countingDuration2() {
		long number = 9999999999l;
		Instant start = Instant.now();//record the start time
		System.out.println("addUpTo: "+addUptoQuick(number));
		Instant end = Instant.now();//record the end time
		Long duration = Duration.between(start, end).toMillis();//check the time duration
		double seconds = duration/1000;//convert miliseconds to seconds
		System.out.println("addUptoQuick time "+seconds+"seconds");
	}
}
