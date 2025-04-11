import java.util.*;
class WordWithMaxLength
{
	public static void  main(String args[])
	{
		Scanner  sc = new Scanner(System.in);
		String s =sc.nextLine();
		String str[]=s.split(" ");
		int max=0;
		String ansi="";
		for(String t:str)
		{
			int l=t.length();
			if(l>=max)
			{
				if(l>max)
				{
					ansi=t;
					max=l;
				}
				else
				{
					ansi+=" "+t;
					max=l;
				}
			}
		}
		System.out.println(ansi);
	}
}