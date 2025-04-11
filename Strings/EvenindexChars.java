class EvenindexChars
{
	public static void main(String args[])
	{
		String str="Hii Everyone";
		for(int x=0;x<str.length();x++)
		{
			if(x%2==0)
				System.out.print(str.charAt(x) +"  ");
		}
	}
}