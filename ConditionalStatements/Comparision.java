class Comparision
{
	public static void main(String args[])
	{
		int num1=10,num2=20;
		if(num1>num2)
		{
			int last_num1=num1%10;
			int last_num2=num2%10;
			System.out.println(num1+"Is greater");
			System.out.println("Last digit of num1 is :"+last_num1);
			System.out.println("Last digit of num2 is :"+last_num2);
		}
		else
		{
			int sum=num1+num2;
			System.out.println(num1+" is greater ");
			System.out.println("Sum of two numbers is : "+sum);
		}
	}
}