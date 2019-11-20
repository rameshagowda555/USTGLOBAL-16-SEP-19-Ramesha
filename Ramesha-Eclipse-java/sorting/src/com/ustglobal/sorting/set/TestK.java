package com.ustglobal.sorting.set;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestK {
	public static void main(String[] args) {
		
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		pq.add(12);
		pq.add(24);
		pq.add(35);
		pq.add(35);
		pq.offer(1);
//		pq.add("Hello"); class cast exception
//		pq.add(23.43); class cast exception
//		pq.add(null); class cast exception
		
		System.out.println("Before poll------------>"+pq);
		Iterator<Integer> it = pq.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
			System.out.println(pq.poll());
		}
		
		System.out.println("After poll()-------->"+pq);
	}
}
