class Greaterusingswitch
{
	public static void main(String args[])
	{
		int num1=10;
		int num2=16;
		char op='<';
		switch(op)
		{
			case '>':
				System.out.println("Greater number is "+(num1>num2 ?num1 :num2));
				break;
			case '<':
				System.out.println("Smaller number is "+ (num1<num2 ?num1:num2));
				break;
			default:
				System.out.println("Enter Valid opereator");
		}	
	}
}