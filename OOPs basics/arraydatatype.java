class arraydatatype
{
	public static void main(String args[])
	{
		int arr[]=new int[3];
		int arri[][]=new int[3][3];
		System.out.println(arr.getClass());
		System.out.println(arri.getClass());
		char arrc[] = new char[3];
		System.out.println(arrc.getClass());
		boolean arrb[]=new boolean[3];
		System.out.println(arrb.getClass());
		boolean arrbtwo[][]=new boolean[3][3];
		System.out.println(arrbtwo.getClass());
	}
}