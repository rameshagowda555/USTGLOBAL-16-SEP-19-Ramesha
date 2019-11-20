package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;


public class TestS {
	public static void main(String[] args) {

		Stack<Teacher> s = new Stack<Teacher>();
		Teacher e1 = new Teacher(101, "Ramesha", 23333.56,"Maths");
		Teacher e2 = new Teacher(102, "Priyanka", 32180.22,"Science");
		Teacher e3 = new Teacher(103, "Arpitha", 21370.42,"Social");
		Teacher e4 = new Teacher(104, "Harshitha", 32275.52,"Physics");

		s .add(e1);
		s .add(e2);
		s .add(e3);
		s .add(e4);

		System.out.println("============Using for loop===========");
		for (int i = 0; i <s.size(); i++) {
			Teacher t = s .get(i);
			System.out.println("Id is "+t.id);
			System.out.println("Name is "+t.name);
			System.out.println("Percentage is "+t.salary);
			System.out.println("Subject name is "+t.subject+'\n');
		}

		System.out.println("============Using for each==========="+'\n');
		for(Teacher t : s) {
			System.out.println(t);
		}

		System.out.println("======Using Iterator==========="+'\n');
		Iterator<Teacher> i =s .iterator();
		while(i.hasNext()) {
			Teacher t = i.next();
			System.out.println(t);
		}

		System.out.println("============Using list iterator==========="+'\n');
		ListIterator<Teacher> l = s .listIterator();
		while(l.hasNext()) {
			Teacher t = l.next();
			System.out.println(t);
		}
	}
}
