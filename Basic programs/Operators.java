class Operators
{
	public static void main(String args[])
	{
		//swapping
                int num1=10;
                int num2=20;
                int num3=0;
                System.out.println("Before swapping :  "+"num1 "+num1+"num 2 "+num2);
                num3=num1;
                num1=num2;
                num2=num3;
		System.out.println("After swapping:   "+"num1 "+num1+"num 2 "+num2);   

               System.out.println("Swapping without using temporary variable");
	       System.out.println("Before swapping :  "+"num1 "+num1+"num 2 "+num2);
               num1=num1+num2;
               num2=num1-num2;
               num1=num1-num2;
              System.out.println("After swapping:   "+"num1 "+num1+"num 2 "+num2); 

              System.out.println("Swapping without using temporary variable");
	       System.out.println("Before swapping :  "+"num1 "+num1+"num 2 "+num2);
               num1=num1*num2;
               num2=num1/num2;
	       num1=num1/num2;
               System.out.println("After swapping:   "+"num1 "+num1+"num 2 "+num2);

                //
		System.out.println("Division and modulo Operations");
                 int a =10;
                 int b=5;
		 System.out.println("num1 is : "+a+"num2 is : "+b);
                 System.out.println("Division "+(a/b)+"modulo"+(a%b));



	}
}
