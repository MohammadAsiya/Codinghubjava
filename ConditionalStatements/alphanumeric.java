class alphanumeric
{
	//Accept character as input and check wheater it is small,capital,space or symbol
	public static void main(String args[])
	{
		char ch='a';
		if(ch>='A' && ch<='Z')
			System.out.println("Capitatl Letter");
		else if(ch>='a' && ch<='z')
			System.out.println("Small Letter");
		else if(ch>='0' &&ch<='9')
			System.out.println("Digit");
		else
			System.out.println("Symbol");
	}
}