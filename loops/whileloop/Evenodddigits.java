class Evenodddigits
{
	public static void main(String args[])
	{
		int num=1578,temp=num,count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		if(count%2==0)
		{
			count=count/2;
			int half=(int)(Math.pow(10,count));
			int sum =num/half + num%half;
			System.out.println(num +" Evennumber of Digits sum of first half and second half is :"+sum);
		}
		else
		{
			int sum=num%10+num/10;
			System.out.println(num +" Oddnumber of Digits sum last digit and remaining digits is :"+sum);

		}
		
	}
}