import java.util.*;
class Evenelements
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
		}
		
		System.out.println("Array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println("Even elements");
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+"	");
			}
		}
	}
}