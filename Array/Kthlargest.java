import java.util.*;
class Kthlargest
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static int kthLargest(int arr[],int k,int prevmaxi)
	{
		if(k==0 || k==1)
		{
			return prevmaxi;
		}
                	int maxi=Integer.MIN_VALUE;
			for(int i=0;i<arr.length;i++)
			{
				if (arr[i]>maxi)
				{
					maxi=arr[i];
					prevmaxi=maxi;
					arr[i]=Integer.MIN_VALUE;
					k--;
				}
			}
			
		return kthLargest(arr,--k,prevmaxi);
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
		int k=sc.nextInt();
		System.out.println(kthLargest(arr,k,0));
	}
}