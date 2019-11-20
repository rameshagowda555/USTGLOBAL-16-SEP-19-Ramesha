package com.ustglobal.arrays;

public class TestC {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ramesha", 83);
		Student s2 = new Student(2, "Shivu", 78);
		Student s3 = new Student(3, "Rajesha", 80);
		Student s4 = new Student(4, "Shilpha", 88);

		Student[] students = new Student[4];

		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		for(Student s : students) {
			System.out.println(s);
		}
		
		System.out.println("**************************");
		
		receive(students);
	}
	static void receive(Student[] stu) {
		for(Student s : stu) {
			System.out.println(s);
		}
}
}
