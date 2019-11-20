
public class Employee {
	String name;
	int eid;
	Employee(String ename,int empid){
		name = ename;
		eid = empid;
	}
	void printDetails() {
		System.out.println("Employe name is "+name);
		System.out.println("Employee id is "+eid);
	}
	
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee("Ramesha",21);
	e1.printDetails();
	Employee e2 = new Employee("Sowbhagya",24);
	e2.printDetails();
	Employee e3 = new Employee("Mahesha",25);
	e3.printDetails();
	
	}
}
