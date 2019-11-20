
public class TestF {
	public static void main(String[] args) {
		Student.collegeName = "Jspiders";
		Student s1 = new Student();
		s1.name = "Ramesha";
		s1.rollNo = 101;
		System.out.println("College Name is = "+ Student.collegeName);
		System.out.println("Name is = "+s1.name);
		System.out.println("ID is = "+s1.rollNo);
		System.out.println("******************************************");
		Student s2 = new Student();
		s2.name = "Mahesha";
		s2.rollNo = 102;
		System.out.println("College Name is = "+ Student.collegeName);
		System.out.println("Name is = "+s2.name);
		System.out.println("ID is = "+s2.rollNo);
		System.out.println("******************************************");
		
	}
}
