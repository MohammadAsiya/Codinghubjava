class Vowels
{
	public static void main(String args[])
	{
		String s="Hello all";
		for(int x=0;x<s.length();x++)
		{
			char ch =s.charAt(x);
			if(ch>='A' && ch<='Z')
			{
				if(ch=='A' || ch=='E' ||ch=='I' ||  ch=='O' ||ch=='U')
				{
					System.out.print(ch+"  ");
				}
			}
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='e' ||ch=='i' ||  ch=='o' ||ch=='u')
				{
					System.out.print(ch+"  ");
				}
			}

		}
	}
}