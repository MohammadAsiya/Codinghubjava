class perfectSquareinrange
{
	public static void main(String args[])
	{
		int start=1,end=500,count=0;
		while(start<end)
		{
			double st=Math.sqrt(start);
			if(st==(int)st)
			{
				System.out.println(start);
				count++;
			}
			start++;
		}
		System.out.println("No of Perfect sqaures in this range are "+count);
	}
}