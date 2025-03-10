class Fibonaccie
{
	public static void main(String args[])
	{
		int n=10;
		int a=0,b=1;
		System.out.println(a);  //0
		System.out.println(b);  //1
		while(n>2)  //10>2  9>2 8>2  7>2 6>2 5>2 4>2 3>2 2>2X
		{
			int c=a+b; //1 2 3 5 8 13 21 34
			System.out.println(c);//1 2 3 5 8 13 21 34
			a=b;//1  2  3  5  8     13   21
			b=c;//2  3  5  8   13  21   34
			n--;//9  8  7  6 5  4  3  2
		}
		
	}
}