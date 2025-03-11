class Primepalindrome
{
	public static void main(String args[])
	{
		int num=1795,start=1,fact=0,temp=num,rev=0;
		do
		{
			if(num%start==0)
			{
				fact++;
			}
			start++;
		}
		while(start<(num/2));
		if(fact==2)
		{
			do
			{
				int r=num%10;
				rev=rev*10+r;
				num=num/10;
			}
			while(num>0);	
			if(rev==temp)
			{
				System.out.println("Prime palindrome");		
			}
			else
			{
				System.out.println("Not Prime palindrome");
			}
		}
		else
			System.out.println("Not Prime palindrome");
	}
}