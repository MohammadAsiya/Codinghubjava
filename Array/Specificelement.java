import java.util.*;
class Specificelement
{
	public static void printarray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static void search(int e,int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==e)
			{
				System.out.println(e+" Element is Found at index "+i );
				return;
			}
		}
		System.out.println(e+" Element is not Found ");
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
		System.out.println("Enter searching element ");
		int s =sc.nextInt();
		search(s,a);
	}
}