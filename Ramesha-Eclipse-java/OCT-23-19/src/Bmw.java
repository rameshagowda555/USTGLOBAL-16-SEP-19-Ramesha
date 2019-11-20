
public class Bmw implements AutoMobile,AutoMobileWithAbs {
	public int gear() {
		System.out.println("gear() method of BMW");
		return 10;
	}
	public void gps() {
		System.out.println("gps() method of BMW");
	}
	@Override
	public void abs() {
		System.out.println("Abs() of Bmw");
		
	}
}
