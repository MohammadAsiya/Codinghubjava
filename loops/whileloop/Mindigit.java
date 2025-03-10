class Mindigit
{
	public static void main(String args[])
	{
		int n=98176338,min=n%10,temp=n;
		while(n>0)
		{
			int r=n%10;
			min=(min<r   ?  min : r);
			n=n/10;
		}
		System.out.println("Minimum digit of number "+temp+" is : "+min);
	}
}