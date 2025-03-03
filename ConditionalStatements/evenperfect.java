class evenperfect
{
	public static void main(String args[])
	{
		int num=16;
		if(num%2==0)
		{
			double n1=Math.sqrt(num);
			if(n1==(int)(n1))
				System.out.println(num+" is Even number and Perfect square");
			else
				System.out.println(num+" is Even number but Not  Perfect square");
		}
		else
		{
			int lastdigit=num%10;
			if(lastdigit%5==0)
				System.out.println(num+" is Odd number and last digit divisible by 5");
			else
				System.out.println(num+" is Odd number but  last digit Not divisible by 5");
				
		}
	}
}