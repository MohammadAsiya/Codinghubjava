class calculator
{
	public static void main(String args[])
	{
		char op='-';
		int num1=10;
		int num2=5;
		int result=0;
		switch(op)
		{
			case '+' :
				result=num1+num2;
				break;
			case '-':
				result=num1-num2;
				break;
			case '*':
				result=num1*num2;
				break;
			case '/':
				result=num1/num2;
				break;
			case '%' :
				result=num1%num2;
				break;
			default:
				result=-1;
		
		}
		System.out.println("num1 : "+num1+"  num2 : "+num2+"  "+ num1 +" "+op+" " +num2+"  =  "+result);
	}
}