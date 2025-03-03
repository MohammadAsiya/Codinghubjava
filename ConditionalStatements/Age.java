class Age
{
	public static void main(String args[])
	{
		int age=10;
		if(age>100)
			System.out.println("Invalid input");
		else if(age>=60)
			System.out.println("Senior citizen");
		else if(age>=18)
			System.out.println("Major");
		else if(age>10)
			System.out.println("Minor");
		else if(age>0)
			System.out.println("Kid");
		else
			System.out.println("Negative age Not acceptable");

	}
}