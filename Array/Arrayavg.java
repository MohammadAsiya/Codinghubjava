class Arrayavg
{
	public static void main(String args[])
	{
		int arr[]={10,3,4,5,67,34,23};
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum+=arr[i];
		System.out.println("Average is"+(sum/arr.length));
	}

}