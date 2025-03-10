class digitprinting
{
	public static void main(String args[])
	{
		int n=12000,rev=0,c=0,a=n;
		//original count
		while(a>0)
		{
			c++;
			a=a/10;
		}
		a=n;
		//reveresing
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}

		n=a;
		//reverse of reverse
		int rev1=rev,revofrev=0;
		while(rev1>0)
		{
			int r=rev1%10;
			revofrev=revofrev*10+r;
			rev1=rev1/10;
		}
		n=a;
		System.out.println("original number "+n);
		System.out.println("Reverse of reverse"+revofrev);
		if(n==revofrev)
		{
			while(rev>0)
			{
				int r=rev%10;
				switch(r)
				{
					case 0 :
						System.out.print("Zero");
						break;
					case 1 :
						System.out.print("One");
						break;

					case 2 :
						System.out.print("Two");
						break;
					case 3 :
						System.out.print("Three");
						break;
					case 4 :
						System.out.print("Four");
						break;
					case 5 :
						System.out.print("Five");
						break;
					case 6 :
						System.out.print("Six");
						break;
					case 7 :
						System.out.print("Seven");
						break;
					case 8 :
						System.out.print("Eight");
						break;
					case 9 :
						System.out.print("Nine");
						break;

				}
				rev=rev/10;
						
			}

		}
		else
		{
			//reverse count
			int reverse=rev,revcount=0;
			
			while(reverse>0)
			{
				int r=reverse%10;
				switch(r)
				{
					case 0 :
						System.out.print("Zero  ");
						break;
					case 1 :
						System.out.print("One  ");
						break;

					case 2 :
						System.out.print("Two  ");
						break;
					case 3 :
						System.out.print("Three");
						break;
					case 4 :
						System.out.print("Four");
						break;
					case 5 :
						System.out.print("Five");
						break;
					case 6 :
						System.out.print("Six");
						break;
					case 7 :
						System.out.print("Seven");
						break;
					case 8 :
						System.out.print("Eight");
						break;
					case 9 :
						System.out.print("Nine");
						break;

				}
				reverse=reverse/10;			
			}
			while(rev>0)
			{
				revcount++;
				rev=rev/10;
			}
			int diff=c-revcount;
			while(diff>0)
			{
				System.out.print(" Zero   ");
				diff--;
			}

		}
		
	}
}