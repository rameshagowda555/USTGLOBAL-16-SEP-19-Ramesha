package com.ustglobal.beanobject.bean;

public class EmpDataBase {
	
	void save(Employee e) {
		System.out.println("Employee Id is "+e.getId());
		System.out.println("Employee Name is "+e.getName());
		System.out.println("Employee Salary is "+e.getSalary());
		System.out.println("Employee Dept is "+e.getDept());
		System.out.println("Employee Designation is "+e.getDesignation());
	}
}
