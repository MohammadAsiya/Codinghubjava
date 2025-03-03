class Asciiconversion
{
	public static void main(String args[])
	{
		char a='A';
                int avalue=a;
		char b='a';
                int bvalue=b;
		char c='z';
                int cvalue=c;
		char d='Z';
                int dvalue=d;
		System.out.println("ASCII value of \"A\" is"+avalue);
		System.out.println("ASCII value of \"a\" is"+bvalue);
		System.out.println("ASCII value of \"z\" is"+cvalue);
		System.out.println("ASCII value of \"Z\" is"+dvalue);
                char h='H';
                int ansi=h+32;
		System.out.println(h+" Conversion to "+(char)(ansi));

		
	}
}