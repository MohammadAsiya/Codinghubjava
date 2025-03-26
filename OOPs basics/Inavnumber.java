//Inav number
import java.util.*;
class Inavnumber
{
	public static int count(int num)
	{
		int c=0;
		while(num>0)
		{
			c++;
			num=num/10;
		}
		return c;
	}
	public static boolean inavnum(int  num)
	{
		while(num>9 || count(num)>1)
		{
			int temp=num;
			int sum=0;
			while(temp>0)
			{
				sum+=temp%10;
				temp=temp/10;
			}
			num=sum;	
		}
		if(num==1)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check Inavnumber or not");
		int num =sc.nextInt();
		System.out.println(num +" is "+( inavnum(num) ?"Inav Number " : "Not Inav Number ") );
	}
}