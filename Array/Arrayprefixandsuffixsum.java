import java.util.*;
class Arrayprefixandsuffixsum
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static int[] prefixandsufixsum(int arr[])
	{
		int pre=arr[0],suf=arr[arr.length-1];
		int b[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			pre=(i==0)?arr[i]:arr[i-1];
			suf=(i==arr.length-1)?arr[i]:arr[i+1];
			int sum=pre+suf;
			b[i]=sum;
		}
		return b;
	}
	public static int[] prefixandsufixsumi(int arr[])
	{
		int pre=arr[0],suf=arr[1];
		int b[]=new int[arr.length];
		b[0]=pre+suf;
		for(int i=1;i<arr.length-1;i++)
		{
			suf=arr[i+1];
			int sum=pre+suf;
			pre=arr[i];
			b[i]=sum;
		}
		b[arr.length-1]=pre+suf;
		return b;
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
		int b[]=prefixandsufixsumi(arr);
		printArray(b);
	}
}