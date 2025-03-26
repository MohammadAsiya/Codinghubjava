import java.util.*;
class Sumprimeornot
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
		System.out.print("A array Elements are : ");
		printarray(a);
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int count=0;
		for(int i=2;i<Math.sqrt(sum);i++)
		{
			if(sum%i==0)
			{
				count++;
				break;
			}
		}
		if(count==0 &&sum>=2)
			System.out.println("Sum is Prime");
		else
			System.out.println("Sum is Not Prime");
	}
}