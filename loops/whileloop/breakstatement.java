class breakstatement
{
	public static void main(String args[])
	{
		int start=1;
		while(start<=10)
		{
			if(start==5)
				break;
			System.out.println(start);
			start++;
		}
		System.out.println("-----------Break executed----------");
		int starti=1;
		while(starti<=10)
		{
			starti++;
			if(starti==5)
				starti++;
				continue;
			System.out.println(starti);
		}
		System.out.println("-----------Continue executed----------");
	}
}