import java.util.*;
class Unique
{
	public static int unique(int arr[])
	{
		int ansi=0;
		for(int i=0;i<arr.length;i++)//1 4 5 1  4
		{	
			int c=0;
		    for(int j=0;j<arr.length;j++)// 1 4 5 1 4
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c==1)
				{
					System.out.println(arr[i]);
					ansi=arr[i];
				}
		}
		return ansi;
	}
	public static void printarray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  A array  size");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter array elements");
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("A array Elements are : ");
		printarray(a);
		System.out.println("Unique one is "+unique(a));
	}

}