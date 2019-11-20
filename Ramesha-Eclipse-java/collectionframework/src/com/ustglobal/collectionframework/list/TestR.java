package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class TestR {
	public static void main(String[] args) {

		Vector<Teacher> v = new Vector<Teacher>();
		Teacher e1 = new Teacher(101, "Ramesha", 23333.56,"Maths");
		Teacher e2 = new Teacher(102, "Priyanka", 32180.22,"Science");
		Teacher e3 = new Teacher(103, "Arpitha", 21370.42,"Social");
		Teacher e4 = new Teacher(104, "Harshitha", 32275.52,"Physics");

		v .add(e1);
		v .add(e2);
		v .add(e3);
		v .add(e4);

		System.out.println("============Using for loop===========");
		for (int i = 0; i <v.size(); i++) {
			Teacher t = v .get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("Percentage is "+t.salary);
			System.out.println("Subject name is "+t.subject+'\n');
		}

		System.out.println("============Using for each==========="+'\n');
		for(Teacher t : v ) {
			System.out.println(t);
		}

		System.out.println("======Using Iterator==========="+'\n');
		Iterator<Teacher> i = v .iterator();
		while(i.hasNext()) {
			Teacher e = i.next();
			System.out.println(e);
		}

		System.out.println("============Using list iterator==========="+'\n');
		ListIterator<Teacher> l = v .listIterator();
		while(l.hasNext()) {
			Teacher e = l.next();
			System.out.println(e);
		}
	}
}
