class Allinreverse
{
	public static void main(String args[])
	{
		String str="Hello Good Morning";
		for(int x=str.length()-1;x>=0;x--)
		{
			System.out.print(str.charAt(x));
		}
	}
}