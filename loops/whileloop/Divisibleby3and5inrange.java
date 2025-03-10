class Divisibleby3and5inrange
{
	public static void main(String args[])
	{
		int start=1,end=100;
		System.out.println("Numbers divisible by 3 and 5 in the range "+start +" "+end +" are :");
		while(start<=end)
		{
			if(start%3==0 && start%5==0)
			{
				System.out.println(start);
			}
			start++;
		}
	}
	
}