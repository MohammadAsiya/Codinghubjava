import java.util.*;
class Arrayswapping
{
	public static void printarray(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static void swaparray(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			a[i]=b[i];
			b[i]=temp;
		
		}

	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter   array  size");
		int n1=sc.nextInt();
		int a[]=new int[n1];
		System.out.println("Enter array elements");
		for(int i=0;i<n1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("A array Elements are : ");
		printarray(a);

		System.out.println("Enter  B array  size");
		int b[]=new int[n1];
		System.out.println("Enter array elements");
		for(int i=0;i<n1;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("B array Elements are : ");
		printarray(b);
		swaparray(a,b);
		System.out.println("After swapping");
		System.out.print("Array A elements :");
		printarray(a);
		
		System.out.print("Array B elements");
		printarray(b);

		
		
	}
}