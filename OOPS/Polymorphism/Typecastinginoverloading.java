class Typecastinginoverloading
{
	public void m2(double  a)
	{
		System.out.println(a);
	}
	public void m1(int a)
	{
		System.out.println(a);
	}
	public void m3(char a)
	{
		System.out.println(a);
	}
	
	public static void main(String args[])
	{
		Typecastinginoverloading obj = new Typecastinginoverloading();		
		obj.m1('c');	//Actual arguments
		obj.m2(23);
		obj.m3((char)(69));
		obj.m4(69);
	}
}