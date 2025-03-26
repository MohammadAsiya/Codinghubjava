import java.util.*;
class Secondmax
{
	public static int secondMax(int arr[])
	{
		int maxi=Integer.MIN_VALUE,secmax=Integer.MIN_VALUE;//2 5 5 3
		for(int i=0;i<arr.length;i++)//2 5
		{
			if(arr[i]>maxi)
			{
				secmax=maxi;
				maxi=arr[i];			}
			else if(arr[i]>secmax && arr[i]!=maxi)
			{
				secmax=arr[i];
			}
		}
		if(secmax==Integer.MIN_VALUE)
		{
			return maxi;
		}
		return secmax;
	}
	public static int secondMin(int arr[])
	{
		int mini=Integer.MAX_VALUE,secmini=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<mini)
			{
				secmini=mini;
				mini=arr[i];
			}
			else if(arr[i]<secmini && arr[i]!=mini)
			{
				secmini=arr[i];
			}
		}
		if(secmini==Integer.MAX_VALUE)
			return mini;
		return secmini;
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
		System.out.println("Second max is "+secondMax(a));
		System.out.println("Second minimum is "+secondMin(a));

	}
}