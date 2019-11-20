
public class Employee2 {
	String name;
	int eid;
	long adharNo;
	public Employee2(String name,int eid,long adharNo) {
		this.name = name;
		this.eid = eid;
		this.adharNo = adharNo;
	}
	public Employee2(String name,int eid) {
		this.name = name;
		this.eid = eid;
	}
	public Employee2(int eid,String name) {
		this.eid = eid;
		this.name = name;
	}
	public void showDetails() {
		System.out.println("Hi "+name+" Welcome to UST Global");
	}

}
