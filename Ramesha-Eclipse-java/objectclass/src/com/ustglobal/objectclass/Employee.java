package com.ustglobal.objectclass;

public class Employee {
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		Employee emp = (Employee)obj;
		if(this.id == emp.id) 
		{
			if(this.name.equals(emp.name))
			{
				if(this.salary == emp.salary)
				{
					return true;
				}
				else 
				{
					return false;
				}
			}
			else 
			{
				return false;
			}
	  }
	else 
		{
		return false;
		}
}


}
