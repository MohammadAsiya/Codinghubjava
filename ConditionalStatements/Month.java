class Month
{
	public static void main(String args[])
	{
		int month=2;
		if(month==2)
			System.out.println("28/29 days");
		else if(month==1 || month==3 ||month==5||month==7||month==8||month==10||month==12)
			System.out.println("31 days");
		else if(month==4||month==6||month==9||month==11)
			System.out.prinltn("30 days");
		else
			System.out.println("Invalid input");
	}
}