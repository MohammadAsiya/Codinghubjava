import java.util.*;
class Firstelementsort
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static int[] bubblesort(int arr[])
	{
		for(int x=0;x<arr.length;x++)
		{
			int max=x;
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]>arr[max])
				{
					int temp=arr[i];
					arr[i]=arr[max];
					arr[max]=temp;
				}
			}
		}
		return arr;
	}
	public static int[] lastelementsmall(int arr[])
	{
		int min=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			if(arr[i]<arr[min])
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return arr;
	}

	public static int[] firstelementlarge(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				int temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
		}
		return arr;
	}
	public static int[] firstelementlargesecondelementsmall(int arr[])
	{
		int max=0,min=arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[max])
			{
				int temp=arr[i];
				arr[i]=arr[max];
				arr[max]=temp;
			}
			else if(arr[i]<arr[min])
			{
				int temp=arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			}
		}
		return arr;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Length");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements : ");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("A array is : ");
		printArray(arr);
		/*int b[]=firstelementlarge(arr);
		System.out.print("First element largest array is : ");
		printArray(b);
		int d[]=lastelementsmall(arr);
		System.out.print("last element smallestarray is : ");
		printArray(d);
		int c[]=bubblesort(arr);
		System.out.print("Sorted array is : ");
		printArray(c);*/
		int c[]=firstelementlargesecondelementsmall(arr);
		printArray(c);
	
	}
}