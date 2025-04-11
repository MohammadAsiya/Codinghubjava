import java.util.*;
class Duplicates
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(s.indexOf(ch)!=s.lastIndexOf(ch))
			{
				if(s2.indexOf(ch)==-1)
				{
					s2+=ch+" ";
				}
			}
		}
		System.out.println("Duplicates are "+s2);
	}
}