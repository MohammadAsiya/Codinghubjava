class countdigits
{
	public static void main(String args[])
	{
		int num=8745,c=0;
		do
		{
			c++;
			num=num/10;
		}
		while(num>0);
		System.out.println(c);
	}
}




















