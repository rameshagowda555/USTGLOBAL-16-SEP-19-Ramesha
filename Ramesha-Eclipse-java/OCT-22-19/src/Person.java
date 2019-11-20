
public class Person {
	String name;
	int age;
	Person(String pname,int page){
		name = pname;
		age = page;
	}
	public static void main(String[] args) {
		Person p = new Person("Divya",20);
		System.out.println(p.name);
		System.out.println(p.age);
		
	}
}
