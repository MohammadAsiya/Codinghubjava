class task1
{
	public static void main(String args[])
	{
		int num=3;
		while(num>1){  //3>1   10>1  5>1  16>1  8>1  2>1
		if(num%2==0) //3%2==0 X    10%2==0  16%2==0   8%2==0 4%2==0  2%2==0
		{
			num=num/2; //num=5  8  4   2 1
		}
		else //3%2!=0  5%2!=0
		{
			num=3*num+1;  //num=10  16
		}
		System.out.println(num);  //10  5  16  8  4  2 1
		}
		
	}
}