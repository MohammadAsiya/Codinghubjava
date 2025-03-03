class fizzbuzz
{
	public static void main(String args[])
	{
		int num=5;
		if(num%3==0)
		{
			if(num%5==0)
				System.out.println("FizzBuzz");
			else
				System.out.println("Fizz");
		}
		else
		{
			if(num%5==0)
				System.out.println("Buzz");
			else
				System.out.println(num);
		}
	}
}