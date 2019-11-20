package com.ustgloal.objectarray.assignment;

public class ObjectStudent {
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Sowndarya", 83.02, "SocialScience");
		Student s2 = new Student(102, "Kajal", 80.52, "Science");
		Student s3 = new Student(103, "Priyanka", 78.57, "Maths");
		Student s4 = new Student(104, "Harshitha", 75.92, "Hindi");
		Student s5 = new Student(105, "Malvika", 84.08, "English");
		Student s6 = new Student(106, "Shilpa", 87.65, "Kannada");
		
		Object[] obj = new Object[8];
		obj[0] = s1;
		obj[1] = s2;
		obj[2] = s3;
		obj[3] = s4;
		obj[4] = s5;
		obj[5] = s6;
		
		System.out.println("===========Using forloop===========");
		for(int i=0;i<obj.length;i++) {
			System.out.println(obj[i]);
		}
		
		System.out.println("===============Using foreach============");
		for(Object ob : obj) {
			System.out.println(ob);
		}
		
		
		
	}
}
