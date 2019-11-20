package com.ustglobal.collectionframework.list;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestQ {
	public static void main(String[] args) {

		LinkedList<Teacher> li = new LinkedList<Teacher>();
		Teacher e1 = new Teacher(101, "Ramesha", 23333.56,"Maths");
		Teacher e2 = new Teacher(102, "Priyanka", 32180.22,"Science");
		Teacher e3 = new Teacher(103, "Arpitha", 21370.42,"Social");
		Teacher e4 = new Teacher(104, "Harshitha", 32275.52,"Physics");

		li .add(e1);
		li .add(e2);
		li .add(e3);
		li .add(e4);

		System.out.println("============Using for loop===========");
		for (int i = 0; i <li .size(); i++) {
			Teacher t = li .get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("Percentage is "+t.salary);
			System.out.println("Subject name is "+t.subject+'\n');
		}

		System.out.println("============Using for each==========="+'\n');
		for(Teacher t : li ) {
			System.out.println(t);
		}

		System.out.println("======Using Iterator==========="+'\n');
		Iterator<Teacher> i = li .iterator();
		while(i.hasNext()) {
			Teacher e = i.next();
			System.out.println(e);
		}

		System.out.println("============Using list iterator==========="+'\n');
		ListIterator<Teacher> l = li .listIterator();
		while(l.hasNext()) {
			Teacher e = l.next();
			System.out.println(e);
		}
	}
}
