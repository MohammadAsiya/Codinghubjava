//Power number
import java.util.*;
class Powernumber
{

	public static boolean powernum(int num)
	{
		int sum=0,prod=1;
		while(num>0)
		{
			sum+=num%10;
			prod*=num%10;
			num=num/10;
		}
		if(sum==prod)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number to check powernumber or not");
		int num=sc.nextInt();
		System.out.println(num+" is "  + ( (powernum(num))?"Is power number":"Not a power number"));
	}
}