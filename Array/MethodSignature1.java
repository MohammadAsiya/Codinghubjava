class MethodSignature1
{
	public static void main(String args[])
	{
		MethodSignature a=new MethodSignature();
		a.m1();
	}
	void m1()
	{
		System.out.println("Void method");
	}
	int m1(int a,int b)
	{
		return a+b;
	}
	void m1(int a,String b)
	{
		System.out.println("Roll no"+a+"Name"+b);
	}
	void m1(String a,int b)
	{
		System.out.println("Name"+a+"Roll no"+b);
	}
	void m1(String a,int b)
	{
		System.out.println("Hello");
	}
}	