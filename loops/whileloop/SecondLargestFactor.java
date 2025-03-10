class SecondLargestFactor
{
	public static void main(String args[])
	{
		int num=24;
		int start=1,end=num/2, max=0,min=0;
		while(start<=end)
		{
			if(num%start==0)
			{
				max=start;
			}
			start++;
		}
		start=1;
		end=num/2;
		while(end>start)
		{
			if(num%end==0)
			{
				min=end;
			}
			end--;
		}
	       
	       System.out.println("Second maximum factor is :"+max);
		System.out.println("Second minimum factor is :"+min);


	}
}