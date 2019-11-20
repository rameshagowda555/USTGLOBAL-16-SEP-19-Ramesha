
public class Student {
	String name;
	int age;
	int id;
	String branch;
	String collegeName;
	public Student(String name,int age,int id,String branch,String collegeName) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.branch = branch;
		this.collegeName = collegeName;
	}
	public void showDetails() {
		System.out.println("Student Name is = "+name);
		System.out.println("Student Age is = "+age);
		System.out.println("Student Id is = "+id);
		System.out.println("Student Branch Name is = "+branch);
		System.out.println("Student college  Name is = "+collegeName+"\n");
	}
	public static void main(String[] args) {
		Student s1 = new Student("RameshaGowda",21,101,"ECE","PESCE Mandya");
		s1.showDetails();
		Student s2 = new Student("MaheshaGowda",20,102,"ECE","PESCE Mandya");
		s2.showDetails();
		Student s3 = new Student("MeghaGowda",21,103,"ECE","PESCE Mandya");
		s3.showDetails();
		Student s4 = new Student("ArpithaGowda",20,104,"ECE","PESCE Mandya");
		s4.showDetails();
		Student s5 = new Student("DivyaGowda",22,105,"ECE","PESCE Mandya");
		s5.showDetails();
		Student s6 = new Student("ShivuGowda",21,106,"ECE","PESCE Mandya");
		s6.showDetails();
		Student s7 = new Student("KumarGowda",21,107,"ECE","PESCE Mandya");
		s7.showDetails();
		Student s8 = new Student("PriyankaGowda",20,108,"ECE","PESCE Mandya");
		s8.showDetails();
		Student s9 = new Student("PrakashGowda",21,109,"ECE","PESCE Mandya");
		s9.showDetails();
		Student s10 = new Student("HarshithaGowda",21,110,"ECE","PESCE Mandya");
		s10.showDetails();
		;
	}
}
