package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestF {
	public static void main(String[] args) {
		
		ArrayList<Marker> al = new ArrayList<Marker>();
		al.add(new Marker(50,"blue"));
		al.add(new Marker(70,"red"));
		al.add(new Marker(80,"green"));
		al.add(new Marker(40,"black"));
		
		System.out.println("Before Sorting------------>");
		display(al);
		
		SortByPrice sb = new SortByPrice();
		Collections. sort(al,sb);
		
		System.out.println("<-----------After sorting By Price-------->");
		display(al);
		
		SortByColor sc = new SortByColor();
		Collections.sort(al,sc);
		
		System.out.println("<---------After Sorting By Color--------->");
		display(al);
		
		
		
	}
	static void display(ArrayList<Marker> al) {
		Iterator<Marker> it = al.iterator();
		while(it.hasNext()) {
			Marker m =  it.next();
			System.out.println("MArker price "+m.price);
			System.out.println("Marker brand is "+m.color);
			System.out.println("-------------------------");
		}
	}
}
