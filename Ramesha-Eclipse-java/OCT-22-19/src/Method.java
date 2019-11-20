
public class Method {
	public static void add(int a,int b)
	{
		System.out.println("static add () method");
	}
	public static void add(float a,int b)
	{
		System.out.println("static add () method");
	}
	public int add(byte a,int b)
	{
		System.out.println(" non static add () method");
		return a+b;
	}
	public long add(long a,long b)
	{
		System.out.println("non static add () method");
		return a+b;
	}
	public final int add(int a,char b)
	{
		System.out.println("final add()method");
		return a+b;
	}
	final int add(int a,byte b)
	{
		System.out.println("final add()method");
		return a+b;
	}
	public static void main(String[] args) {
		Method m = new Method();
		m.add(5,4);
		m.add(10,'a');
		m.add(100,100);
		m.add(10.5f, 10);
		m.add(10,10);
		m.add(10, 5);

	}
}
