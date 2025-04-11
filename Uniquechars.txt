import java.util.*;
class Uniquechars
{
	public static void main(String args[])
	{
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt();
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.print(ch+" ");
			}
		}
	}
}