class captoconversion
{
	//Write a code if it is capital letter than convert to small if it is small letter convert to Capital
	public static void main(String args[])
	{
		char ch='a';
		if(ch>='A' &&ch<='Z')
			System.out.println("Given char is "+ch+" Conversion "+((char)(ch+32)));
		else if(ch>='a' &&ch<='z')
			System.out.println("Given char is "+ch+" Conversion "+((char)(ch-32)));
		
	}
}