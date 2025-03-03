class retirement
{
	public static void main(String args[])
	{
		int age=55;
		if(age>=60)
		{
			String gender="Female";
			if(gender=="Female")
				System.out.println("Retirement salary per month is 30000 because you are Female");
			else
				System.out.println("Retirement salary per month is 35000 because you are Male");

		}
		else if(age>=18)
		{
			String edu="UG";
			if(edu=="UG")
				System.out.println("your Scholorship per year is 30000");
			else if(edu=="PG")
				System.out.println("your Scholorship per year is 40000");
			else
				System.out.println("your Scholorship per year is 20000");
		}
		else
			System.out.println("You are not eligible for retirement salary /Scholorship because you are Minor");


		String edu="UG";
		String gender="Female";

		System.out.println("--------------------------------------------------------------------");
		System.out.println();
		System.out.println(  age>=60 ?  (gender=="Female" ?"Retirement salary per month is 30000 because you are Female":"Retirement salary per month is 35000 because you are Male"):  ( age>=18 ?  ( edu=="UG"?  "your Scholorship per year is 30000"  :  edu=="PG" ? "your Scholorship per year is 40000":"your Scholorship per year is 20000"  ) :  "You are not eligible for retirement salary /Scholorship because you are Minor") );

		}
}