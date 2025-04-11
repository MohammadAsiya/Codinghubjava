import java.util.Scanner;
class PalindromeWords
{
	public static void main(String args[])
	{
		Scanner  sc = new Scanner(System.in);
		String s =sc.nextLine();
		String str[]=s.split(" ");
		int max=0;
		for(String t : str)
		{
			StringBuffer sb = new StringBuffer(t);
			String rev= (sb.reverse()).toString();
			if(t.equals(rev))
			{
				System.out.println(t);
			}			
		}
	}
}