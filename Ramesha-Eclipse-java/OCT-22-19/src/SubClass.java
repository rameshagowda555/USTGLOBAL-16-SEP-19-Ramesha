
public class SubClass extends SuperClass {
	String s = "Sub Class Variable";
	SubClass(){
		
		System.out.println("SubClass constructor");
	}
	void getsData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		super.superClassMethod();
	}
}
