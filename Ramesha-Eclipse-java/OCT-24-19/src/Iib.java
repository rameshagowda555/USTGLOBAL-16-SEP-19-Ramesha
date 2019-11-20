
public class Iib {
	int a;
	static int b;
	{
		a = 10;
		b = 20;
		System.out.println("non static Block1");
	}
	public static void main(String[] args) {
		System.out.println("main started");
		Iib i1 = new Iib();
		Iib i2 = new Iib();
		System.out.println("main ended");
		
	}
	{
		a = 10;
		b = 20;
		System.out.println("non static Block2");
	}
}
