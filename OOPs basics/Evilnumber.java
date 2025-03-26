//Evil number
import java.util.*;
class Evilnumber
{

	public static boolean evilnum( int num)
	{
		int sum=0;
		int square = num*num;
		while(square>0)
		{
			sum+=square%10;
			square/=10;
		}
		if(sum==num)
		{
			return true;
		}
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Evil number "+evilnum(num));
	}
}
