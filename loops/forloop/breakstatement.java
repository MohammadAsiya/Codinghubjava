class breakstatement
{
	public static void main(String args[])
	{
		for(int i=1;i<10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		System.out.println("-----------Break executed----------");
		for(int j=1;j<10;j++)
		{
			if(j==5)
				continue;
			System.out.println(j);
		}
		System.out.println("-----------Continue executed----------");

		
	}
}