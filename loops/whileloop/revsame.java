class revsame
{
	public static void main(String args[])
	{
		int a=12000,rev=0,num1=a,c=0;
		//counting
		while(num1>0)
		{
			c++;
			num1=num1/10;
		}
		num1=a;
    
		//reversing
		while(a>0)
		{
			int r=a%10;
			rev=rev*10+r;
			a=a/10;
		}
		a=num1;
		System.out.println("reverse of number"+rev);
		int rev1=0;

		//reverse of revese
		while(rev>0)
		{
			int r=rev%10;
			rev1=rev1*10+r;
			rev=rev/10;
		}
		if(rev1==a)
		{
		System.out.println("reverse of reverse number"+rev1);
		}
		else
		{
			int count2=0;
			int elsea=rev1;
			while(elsea>0){
				count2++;
				elsea=elsea/10;
			}
			int diff=c-count2;
			while(diff>0)
			{
				rev1*=10;
				diff--;
			}
			System.out.println("reverse of reverse number"+rev1);
		}
			
			
		
	}
}