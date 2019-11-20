
public class TestH {
	public static void main(String[] args) {
		FirstGen f = new FirstGen();
		f.call();
		f.msg();
		System.out.println("*********************************");
		SecondGen sc = new SecondGen();
		sc.call();
		sc.msg();
		sc.games();
		System.out.println("*********************************");
		ThirdGen th = new ThirdGen();
		th.call();
		th.msg();
		th.games();
		th.camera();
	}
}
