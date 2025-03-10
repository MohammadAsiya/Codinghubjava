class Problem2
{
	public static void main(String args[])
	{
		int number=75325,start=1,sum=0;
		while(number>999)
		{
			int q=number%10;
			sum +=(q*start);
			number=number/10;
			start++;
		}
		System.out.println(sum);
	}
}