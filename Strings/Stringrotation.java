import java.util.*;
class Stringrotation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		char arr[]=s1.toCharArray();
		for(int i=0;i<2;i++)
		{
			char f=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)
			{
				arr[j]=arr[j-1];
			}
			arr[0]=f;
		}
		String ansi="";
		for(int i=0;i<arr.length;i++)
			ansi+=arr[i];
		System.out.println(ansi);
		if(ansi.equals(s2))
		{
			System.out.println("Equal after 2 rotations");
		}
		else
		{
			System.out.println("Not Equal after 2 rotations");
		}
	}
}