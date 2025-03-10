class Factors
{
	public static void main(String args[])
	{
		int num=6,start=1,end=500,sum=0,product=1,count=0;
		System.out.println("Factors of number "+num+"is");
		while(start<=end)      //1<=6   2<=6  3<=6  4<=6  5<=6  6<=6   7<=6X
		{
			if(num%start==0)    //6%1==0 t    6%2==0 t 6%3==0 t 6%4==0 f 6%5==0 f 6%6==0 t 
			{     
   				sum+=start;    //1   1+2=3    3+3=6   6+6=12
				product*=start;  //1     1*2=2   2*3=6   6*6=36
				count++;		 //1   2  3  4
				System.out.println(start);//  1  2  3  6
			}
			start++;//1  2  3  4  5  6
		}
		System.out.println("No of Factors "+count);   //4
		System.out.println("sum is  : "+sum);  //12
		System.out.println("Product is  : "+product);  //36
	}
}