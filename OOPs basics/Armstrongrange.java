//Armstrong range
import java.util.*;
class Armstrongrange
{
	public static void armstrongrange(int num1,int num2)
	{
		while(num1<num2)
		{
			int p=num1;
			int sum=0,c=0;
			int temp=num1;
			while(temp>0)
			{
			 	c++;
				temp/=10;
			}			
			while(p>0)
			{
				int r=p%10;
				sum+=Math.pow(r,c);
				p=p/10;
			}
			if(sum==num1)
				System.out.println(num1);
			num1++;
		}
	}
	public static void main (String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of numbers to check Armstrong numbers between them ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		armstrongrange(num1,num2);
	}
}