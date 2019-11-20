class Bmione
{
	public static void main(String[] args)
	{
	int weight = 700;
	double height = 1.558;
	double ans = weight /(height * height);
	System.out.println( ans);
         if(ans >= 40)
	{
	System.out.println(" out of range please give correct values");
	}
	else if(ans >= 30 && ans <= 39.9)
	{
	System.out.println(" you are in obese weight range");
	}
	else if(ans >= 25)
	{
	System.out.println(" you are in over weight range");
	}
	else if(ans >= 18.5)
	{
	System.out.println(" you are in healthy weight range");
	}
	else if(ans < 18.5)
	{
	System.out.println(" you are in underweight range");
	}
    }
}