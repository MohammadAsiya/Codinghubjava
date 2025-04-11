import java.util.*;
class FirstLetterofWord
{
	public static void main(String args[])
	{
		//String s ="Vital Information Resources under seize";
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String s2="";
		String str[]=s.split(" ");
		for(String t :str)
		{
			s2+=t.charAt(0);
		}
		System.out.println(s2);
	}
}