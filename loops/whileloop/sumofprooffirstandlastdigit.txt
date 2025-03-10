class sumofprooffirstandlastdigit
{
	public static void main(String args[])
	{
		int number=651111,n2=number,c=0;
		while(n2>0)
		{
			c++;
			n2=n2/10;
		}
		int start=(c-1),sum=0;
		while(number>9)
		{
			int q=number%10;

			
			//System.out.println("Last digit "+q);

			int x=(int)(Math.pow(10,start));
			int f=number/x;
			//System.out.println("first digit "+f);

			
			int s =(q*f);
			sum +=s;
			//System.out.println("present sum "+s);
			//System.out.println("Total sum "+sum);

			number=number%x;
			//System.out.println("Last decrement "+number);
			number=number/10;
			//System.out.println("First decrement "+number);

			start-=2;
			
			
		}
		System.out.println(sum+number);
	}
}