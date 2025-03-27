import java.util.*;
class Avgarmstrong
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static boolean armstrong(int n)
	{	
		int temp=n;
		int c=0;
		while(n>0)
		{
			c++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum+=(int)Math.pow(r,c);
			n=n/10;
		}
		return (sum==temp);
	}
	public static void avgarmstrong(int []arr,int sum)
	{
		double avarage=(double)sum/arr.length;
		int avg=(int)(avarage);
		boolean t =armstrong(avg);
		if(t)
			System.out.println("This array avarage is armstrong number ");
		else
			System.out.println("This array avarage is not armstrong number ");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array Length");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" elements : ");
		int arr[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		avgarmstrong(arr,sum);
	}
}