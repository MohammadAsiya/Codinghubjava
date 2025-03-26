class Printvoid
{
	public static void main(String args[])
	{
		int a;
		System.out.println();
		Printvoid pv =new Printvoid();
		System.out.println(pv.integertype(10));
		pv.increment(5);
	}
	void increment(int a)
	{
		System.out.println("Hii");
	}
	int integertype(int a)
	{
		return 100;
	}
}