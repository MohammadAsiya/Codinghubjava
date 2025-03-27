class NegativetoOther
{
	public static void printArray(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"   ");
		}
		System.out.println();
	}
	public static int[] Negativeelements(int arr[])
	{
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				c++;
		}
		int b[]=new int[c];
		int x=c-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<0)
				b[x--]=arr[i];
		}
		return b;

	}
	public static void main(String args[])
	{
		int a[]=new int[]{10,30,-4,56,-4,54,-3};
		System.out.println("A Array elements : ");
		printArray(a);
		int b[]=Negativeelements(a);
		System.out.println("Negative elements array ");
		printArray(b);
	}
}