import java.util.*;
class LinearSearch
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	void linearSearch(int arr[],int e)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==e)
			{
				System.out.println("Element found at index : "+i);
				return;			
			}
		}
		System.out.println("Element Not found ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a[]=new int[]{19,13,24,45,23,75};
		printArray(a);
		System.out.println("Enter Search Element");
		int n=sc.nextInt();
		LinearSearch l=new LinearSearch();
		l.linearSearch(a,n);
		
	}
}
