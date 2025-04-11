import java.util.*;
class Arrayrotation
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static void onerotation(int arr[])
	{
		int a=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=a;
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
		onerotation(arr);
		System.out.println("Array after one rotation");
		printArray(arr);
	}
}