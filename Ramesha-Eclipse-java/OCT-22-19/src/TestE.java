
public class TestE {
	
	public static void main(String[] args) {
		
		Bus b = new Bus();
		b.printDetails();
		Bus b1 = new Bus(50);
		b1.printDetails();
		Bus b2 = new Bus(60,"Blue");
		b2.printDetails();
	}
}
