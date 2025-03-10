class Palindrome
{
	public static void main(String args[])
	{
		int num=97079,rev=0,temp=num;
		while(num>0)
		{
			int r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
			
	}
}