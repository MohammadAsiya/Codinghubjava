import java.util.*;
class Copythearray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array  size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("A Array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int brr[]=new int[arr.length];
		for(int i=0;i<brr.length;i++)
		{
			brr[i]=arr[i];
		}

		System.out.println("B Array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.print(brr[i]+" ");
		}
		


	}

}