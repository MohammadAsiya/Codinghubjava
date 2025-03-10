class Primepalindrome
{
	public static void main(String args[])
	{
		int num=97079,rev=0,temp=num;
		int start=1,factors=0;
		while(start<(temp/2))
		{
			if(num%start==0)
			{
				factors++;
			}
			start++;
		}
			if(factors==2)
			{
				while(num>0)
				{
					int r=num%10;
					rev=rev*10+r;
					num=num/10;
				}
				if(temp==rev)
					System.out.println("Prime Palindrome");
				else
					System.out.println("Not Palindrome");

			}
			else
				System.out.println("Not PrimePalindrome");
		
	}
}