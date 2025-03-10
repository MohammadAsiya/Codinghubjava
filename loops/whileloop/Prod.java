class Prod
{
	public static void main(String args[])
	{
		int n=123;
		int temp=n,sum=0,c=0,ansi=0;
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;
			c++;
		}
		while(c>0)
		{
			int r=temp%10;
			int op=sum/r;
			ansi=ansi*10+op;
			temp=temp/10;
			c--;
		}
		int output=0;
		while(ansi>0)
		{
			int r=ansi%10;
			output=output*10+r;
			ansi=ansi/10;
		}
		System.out.println(output);
	}
}