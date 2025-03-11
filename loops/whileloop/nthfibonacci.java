class nthfibonacci
{
	public static void main(String args[])
	{
		int n=17,a=0,b=1;
		for(int i=1;i<n;i++)
		{
			System.out.println(i +" th Fibonacci number is "+a);
			int c=a+b;
			a=b;
			b=c;
		}
		System.out.println(n +" th Fibonacci number is "+a);
	}
}