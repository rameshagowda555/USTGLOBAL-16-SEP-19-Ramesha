
public class Employee1 {
	String name;
	int eid;
	Employee1(String name,int eid){
		this.name = name;
		this.eid = eid;
	}
	void printDetails() {
		System.out.println("Employe name is = "+name);
		System.out.println("Employee id is = "+eid);
		this.sayHello();
	}
	void sayHello() {
		System.out.println("Hello"+" "+name+" "+"Welcome to UST global Company");
	}
	
	public static void main(String[] args) {
		
		Employee1 e1 = new Employee1("Ramesha",21);
		e1.printDetails();
		Employee1 e2 = new Employee1("Sowbhagya",37);
		e2.printDetails();
		Employee1 e3 = new Employee1("Mahesha",45);
		e3.printDetails();
	}
}
