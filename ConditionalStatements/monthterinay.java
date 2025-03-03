class monthterinay
{
	public static void main(String args[])
	{
		int m=9;
		System.out.println((m==1 || m==3||m==5||m==7||m==8||m==10||m==12)?"31 DAYS" :(m==4 || m==6||m==9||m==11)?"30 DAYS":(m==2)?"28/29DAYS":"Invalid Input");
	}
}