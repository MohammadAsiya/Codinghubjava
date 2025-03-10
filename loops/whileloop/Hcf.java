class Hcf
{
	public static void main(String args[])
	{
		int num1=6,num2=12,max=0,mini=1234567;
		int min=(num1>num2 ?num2:num1);
		int start=1,end=min/2;
		System.out.println("Common factors are : ");
		while(start<=end)
		{
			if(num1%start==0 && num2%start==0)
			{	System.out.println(start);
				max=start;
				mini=(start<mini?start:mini);
			}
			start++;
		}
		System.out.println("HCF is "+max);
		System.out.println("LCF is " +min);
	}
}