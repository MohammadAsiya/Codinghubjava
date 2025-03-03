class Lib
{
	public static void main(String args[])
	{
		int returndays=30;
		int bookprice=500;
                boolean student=true;
		String edu="btech";
		int charges=0;
		if(student)
		{
			charges=((edu=="btech" || edu=="bsc")?20:((edu=="Mtech" || edu=="msc")?30:(edu=="phd" ?					40:(edu=="Inter" ?15 :(edu=="ssc" ? 10 :50)))));
		}
		if(returndays<=10)
			System.out.println("No charges");
		else if(returndays<=20)
			System.out.println("Charges"+ (returndays*charges));
		else
			System.out.println("Charges "+bookprice);
	}
}