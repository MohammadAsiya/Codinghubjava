class MethodSignature1 extends MethodSignature2
{
	public static void main(String args[])
	{
		MethodSignature1 a=new MethodSignature1();
		a.m1("Abc",21);
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
	/*void m1(String a,int b)
	{
		System.out.println("Child class Method executed");
	}*/

}	