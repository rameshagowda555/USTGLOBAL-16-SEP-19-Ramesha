package com.ustglobal.beanobject.bean;

public class TestA {
	public static void main(String[] args) {
		Student s = new Student();
		s.setId(12);
		s.setName("Priyanka");
		s.setRollNo(143);
		DataBase db = new DataBase();
		db.receive(s);//it is used in hibernet we have to pass bean class reference
		
		
		Employee  e = new Employee();
		e.setId(101);
		e.setName("Ramesha");
		e.setSalary(30000.0);
		e.setDept("Development");
		e.setDesignation("Associate SoftWare Engineer");
		
		EmpDataBase ed = new EmpDataBase();
		ed.save(e);//it is used in hibernet we have to pass bean class reference
	}
}
