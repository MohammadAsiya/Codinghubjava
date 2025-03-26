class Methods

{
	int c=5;
	int d;
	void method1(int a,int b)
	{
		System.out.println("Sum is "+(a+b));
	}
	int method2()
	{
		int a=5,b=6;
		return a+b+c+d;
	}
	int method3(int d
 )
	{
		return c+d;
	}

	public static void main(String args[])
	{
		int a=10,b=5;
		Methods m = new Methods();
		m.method1(a,b);
		m.d=19;
		System.out.println(m.method2());
		System.out.println(m.method3(30));
	}
}