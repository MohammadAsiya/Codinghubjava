import java.util.*;
class CopytwoArraystoOne
{

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

		System.out.println("Enter  B array  size");
		int n2=sc.nextInt();
		int b[]=new int[n2];
		System.out.println("Enter array elements");
		for(int i=0;i<n2;i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.print("Array A elements are :  ");
		printarray(a);
		System.out.print("Array B elements are :   ");
		printarray(b);


		int c[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int i=0;i<b.length;i++)
			c[i+a.length]=b[i];
		
		System.out.print("Array C elements are :  ");
		printarray(c);
		
		
		
	}
}