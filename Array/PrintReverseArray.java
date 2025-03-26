import java.util.*;
class PrintReverseArray
{
	public static void main(String args[])
	{
		System.out.println("Enter array Size");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(arr[i]+"   ");
		}
	}
}