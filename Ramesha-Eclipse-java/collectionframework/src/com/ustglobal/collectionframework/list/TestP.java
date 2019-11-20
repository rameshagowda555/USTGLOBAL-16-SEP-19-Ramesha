package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestP {
	public static void main(String[] args) {
		
		ArrayList<Teacher> al = new ArrayList<Teacher>();
		Teacher e1 = new Teacher(101, "Ramesha", 23333.56,"Maths");
		Teacher e2 = new Teacher(102, "Priyanka", 32180.22,"Science");
		Teacher e3 = new Teacher(103, "Arpitha", 21370.42,"Social");
		Teacher e4 = new Teacher(104, "Harshitha", 32275.52,"Physics");
		
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		
		System.out.println("============Using for loop===========");
		for (int i = 0; i < al.size(); i++) {
			Teacher t = al.get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("Percentage is "+t.salary);
			System.out.println("Subject name is "+t.subject+'\n');
		}
		
		System.out.println("============Using for each===========");
		for(Teacher t : al) {
			System.out.println(t);
		}
		
		System.out.println("======Using Iterator===========");
		Iterator<Teacher> i = al.iterator();
		while(i.hasNext()) {
			Teacher e = i.next();
			System.out.println(e);
		}
		
		System.out.println("============Using list iterator===========");
		ListIterator<Teacher> l = al.listIterator();
		while(l.hasNext()) {
			Teacher e = l.next();
			System.out.println(e);
		}
	}
}
