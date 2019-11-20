package com.ustgloal.objectarray.assignment;

public class Student {
	int id;
	String name;
	double percentage;
	String subjectname;
	public Student(int id, String name, double percentage, String subjectname) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.subjectname = subjectname;
	}
	@Override
	public String toString() {
		return "Student [id = " + id + ", name = " + name + ", percentage = " + percentage + ", subjectname = " + subjectname
				+ "]";
	}
	
}
