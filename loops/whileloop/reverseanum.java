class reverseanum
{
	public static void main(String args[])
	{
		int num=279079,rev=0,temp=num;
		while(num>0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println(temp+"  reverse of the number is : "+rev);
	}
}