class Studentgrades
{
	public static void main(String args[])
	{
		int marks=500;
		if(marks>=560 && marks<=600)
			System.out.println("Grade O");
		else if(marks>=500 && marks<560)
			System.out.println("Grade A");
		else if(marks>=400 && marks<500)
			System.out.println("Grade B");
		else if(marks>=350 && marks<400)
			System.out.println("Grade C");
		else if(marks>=250 && marks<350)
			System.out.println("Grade D");
		else 
			System.out.println("Fail");
	}
}