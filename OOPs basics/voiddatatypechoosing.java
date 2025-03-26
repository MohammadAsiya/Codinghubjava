class voiddatatypechoosing
{
	public static void main(String args[])
	{
		voiddatatypechoosing v =new voiddatatypechoosing();
		v.hi((byte)1);
	}
	 void hi(int a)
	{
		System.out.println("Integer");
	}
	void hi(short a)
	{
		System.out.println("Short");
	}
	void hi(byte a)
	{
		System.out.println("Byte");
	}
}
