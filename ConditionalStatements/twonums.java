class twonums
{
	public static void main(String args[])
	{
		int a=5;
		int b=5;
		if(a==b)
			System.out.println("Equal Numbers");
		else if(a>b)
			System.out.println(a+" number is greater");
		else
			System.out.println(b+" number is greater");

                System.out.println("----------------------------------------------------------------------");

		System.out.println( a==b ?  "Numbers are equal"  :  (  "Greater number is "+  (a>b? a : b) )  );

	}
}