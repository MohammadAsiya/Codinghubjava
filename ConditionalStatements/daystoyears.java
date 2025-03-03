class daystoyears
{
	public static void main(String args[])
	{
		int totaldays=400;
		int days=totaldays;
		int years=400/365;
		days=days-(365*years);
		int months=days/31;
		days=days-(31*months);
		System.out.println("For "+totaldays+"  "+years +"  years  "+months +"  months "+days +" days ");
	}
}