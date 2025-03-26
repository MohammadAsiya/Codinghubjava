//Prime range
import java.util.*;
class Primerange
{
	public static void primerange(int num1,int num2)
	{
		while(num1<num2)
		{
			int p=num1;
			int i=2,c=0;
			if(p<2)
				c++;
		        while(i<Math.sqrt(p))
			{
				if(p%i ==0)
				{	c++;
					break;
				}
				i++;
			}
			if(c==0)
				System.out.println(p);
			num1++;
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter range of numbers to check Prime numbers between them ");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		primerange(num1,num2);
	}
}