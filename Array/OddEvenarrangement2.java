import java.util.*;
class OddEvenarrangement2
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
		for(int i=0;i<n1;i++) //1 2 3 4 5
		{
			a[i]=sc.nextInt();
		}
		System.out.print("A array Elements are : ");
		printarray(a);

		int i=0,j=a.length-1;
		while(i<j)
		{
			if(a[i]%2==0  && a[j]%2!=0)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=a[i];
				i++;
				j--;
			}
			else if(a[i]%2!=0)
			{
				while(a[i]%2!=0)
					i++;
			}
			else if(a[j]%2==0)
			{
				while(a[j]%2==0)
					j--;
			}

		}	
		System.out.println("After updation");
		printarray(a);	
	}
}