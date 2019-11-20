package com.ustglobal.collectionframework.list;

public class Teacher {
	int id;
	String name;
	Double salary;
	String subject;
	public Teacher(int id, String name, Double salary, String subject) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", salary=" + salary + ", subject=" + subject + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
