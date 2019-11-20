
public class TestC {
	public static void main(String[] args) {

		Person.color = "White";
		Person.sleep();
		System.out.println("Color is = "+Person.color);
		System.out.println("*******************");
		Person p = new Person();
		p.name = "Ramesha";
		p.age = 21;
		p.color = "white";
		System.out.println("Name is = "+p.name);
		System.out.println("person age is = "+p.age);
		System.out.println("Color is = "+p.color);
		p.eat();
		p.walk();
		System.out.println("*****************************");
		Person p1= new Person();
		p1.name = "Ram";
		p1.age = 22;
		p1.color = "Black";
		System.out.println("Name is = "+p1.name);
		System.out.println("person age is = "+p1.age);
		System.out.println("Color is = "+p1.color);
		p1.eat();
		p1.walk();
	}
}
