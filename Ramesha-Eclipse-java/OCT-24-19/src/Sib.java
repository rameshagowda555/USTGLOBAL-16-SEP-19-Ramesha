
public class Sib {
	static int a ;
	int b;
	static {
		a = 10;
		System.out.println("Static initialization block1");
	}
	Sib(){
		System.out.println("Sib() constructor");
	}
	public static void main(String[] args) {
		Sib s1 = new Sib();
		Sib s2 = new Sib();
		System.out.println("A value is = "+a);
	}
	static {
		a = 20;
		System.out.println("Static initialization block2");
	}
	static {
		a = 40;
		System.out.println("Static initialization block3");
	}
}
