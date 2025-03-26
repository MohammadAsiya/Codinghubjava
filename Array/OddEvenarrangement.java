import java.util.*;
class OddEvenarrangement
{
	public static void printarray(int arr[])
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

		int b []=new int[a.length];
		int y=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				b[y++]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				b[y++]=a[i];
		}
		System.out.println("Array after arranging even elements together than Odd elements is  : ");
		printarray(b);
		
	}
}