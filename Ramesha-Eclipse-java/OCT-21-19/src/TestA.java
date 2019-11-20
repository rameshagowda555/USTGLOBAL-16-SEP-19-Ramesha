
public class TestA {
	public static void main(String[] args) {
		Pen p =	new Pen();
		p.cost = 100;
		p.brand = "Cello";
		p.color = "Balck";
		System.out.println("pen Cost is "+p.cost);
		System.out.println("pen Brand is "+p.brand);
		System.out.println("pen Color is "+p.color);
		p.write();

		System.out.println("*****************************************");
		Van v = new Van();
		v.cost = 400000;
		v.color = "Red";
		System.out.println("van Cost is "+v.cost);
		System.out.println("van Color is "+v.color);
		v.move();
		
		System.out.println("*************************************");
		Van v1 = new Van();
		v1.cost = 500000;
		v1.color = "White";
		System.out.println("van Cost is "+v1.cost);
		System.out.println("van Color is "+v1.color);
		v1.move();
		
		
		
	}
}
