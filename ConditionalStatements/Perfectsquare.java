class Perfectsquare
{
	public static void main(String args[])
	{
		int num=25;
		double ansi=Math.sqrt(num);
		int ansitypo=(int)(ansi);
		if(ansitypo==ansi)
		{
			System.out.println("Perfect Square");
		}
		else
		{
			System.out.println("Not a Perfect Square");
		}
               System.out.println("The number is Perfect number : "+(((Math.sqrt(num))==((int)(Math.sqrt(num))))?true:false));                
	}
}