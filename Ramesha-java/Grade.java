class Grade
{
	public static void main(String[] args)
	{
		int grade = 'A';
		switch(grade)
		{
		case 'D' : System.out.println(" Just Pass ");
		           break;
		case 'C' : System.out.println("Sc ");
		           break;
		case 'B' : System.out.println("Fc ");
		           break;
		case 'A' : System.out.println("Fcd ");
		           break;
		case 'E' : System.out.println("Fail");
		           break;
		default  : System.out.println("Not Matched");
		         
	 	}
	}
}