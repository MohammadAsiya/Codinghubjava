//Automatic number
import java.util.*;
class Automaticnumber
{
	public static boolean automaticnum(int num)
	{
		int temp =num ,numcount=0;
		while(temp>0)
		{
			numcount++;
			temp=temp/10;
		}
		int square=num*num;

		int autonum= square%((int)(Math.pow(10,numcount)));
		
		if(autonum == num)
			return true;
		return false;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to check Automatic number or not");
		int num=sc.nextInt();
		System.out.println(num+" is "+  (  automaticnum(num) ? "Automatic number "  : "Not Automatic number ")    );
		
	}
}