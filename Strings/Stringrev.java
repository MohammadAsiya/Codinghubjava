import java.util.*;
class Stringrev
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			s2=s.charAt(i)+s2;
		}
		System.out.println(s2);
	}
}






















