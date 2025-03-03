class digits
{
	public static void main(String args[])
	{
		int number =986;
		if(number>=0 &&number<10)
			System.out.println(number);
		else if(number>=10 && number<100)
			System.out.println(number%10);
		else if(number>=100 && number<1000)
			System.out.println(number%100);
		else 
			System.out.println("Invalid number");
	}
}