import java.util.*;
class PerfectsquareElement
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
		int b[]=new int[a.length];
		int c[]=new int[a.length];

		int y=0,z=0;
		for(int i=0;i<a.length;i++)
		{
			int p=a[i];
			double q=Math.sqrt(p);
			if(q==(int)q)
				b[y++]=a[i];
			else
				c[z++]=a[i];
		}
		System.out.println("Perfects square numbers are ");
		for(int i=0;i<y;i++)
			System.out.print(b[i]+"	");
		System.out.println();

		System.out.println("Not Perfects square numbers are ");
		for(int i=0;i<z;i++)
			System.out.print(c[i]+"	");
		System.out.println();
		

	
	}
}