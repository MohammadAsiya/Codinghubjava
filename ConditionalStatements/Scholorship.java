class Scholorship
{
 	public static void main(String args[])
	{
		int Fee=50000;
		int scholorship=0;
		String gender="Female";
		if(gender=="Female")
		{
			scholorship=20000;
		}
		else
		{
			scholorship=15000;
		}
		System.out.println("Your total fee is : "+(Fee-scholorship)+"Because your gender is : "+gender);
	}
}