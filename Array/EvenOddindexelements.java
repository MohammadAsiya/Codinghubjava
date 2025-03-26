import java.util.*;
class EvenOddindexelements
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
		System.out.println("Enter array  size");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("Evenandodd index Array elements are");
		int b[] =new int[arr.length];
		int x=0;//5
		int a=arr.length%2==0?arr.length/2  : ((arr.length/2)+1);//
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				b[x++]=arr[i];
			}
			else
			{
				b[a++]=arr[i];
				
			}
		}
		printarray(b);
	}
}