
public class Student {
	String name;
	int  rollNo;
	final static String cname = "PESCE Mandya";
	final int cid;
	Student(String name,int rollNo,int cid){
		
		this.name = name;
		this.rollNo = rollNo;
		this.cid = cid;
	}
	Student(){
		this.cid =101;
	}

	final void printDetails() {
		System.out.println("Hi "+name+" Welcome to "+cname);
	}
	final void printDetails(String name) {
		System.out.println("Hi "+name+" Welcome to "+cname);
	}
}