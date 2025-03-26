import java.util.*;
class Maxinarray
{
	public static void printarray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
       public static int maxi(int arr[])
	{
		int maxi=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			maxi=(maxi>arr[i] ?maxi :arr[i]);
		}
		return maxi;
	}

	public static int mini(int arr[])
	{
		int mini=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			mini=(mini<arr[i] ?mini :arr[i]);
		}
		return mini;
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
		System.out.println("Maximum element in array is "+maxi(a));
		System.out.println("Minimum element in array is "+mini(a));


	}
}