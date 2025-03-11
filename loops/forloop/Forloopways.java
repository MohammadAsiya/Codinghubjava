class Forloopways
{
	public static void main(String args[])
	{
		for(int start=0;start<5;start++)
		{
			System.out.println("Hi");
		}
		System.out.println("-------------------------------------------------------------------------");

		for(int start=1,end=10;start<end;start++,end--)
		{
			System.out.println("Multiple variables initialization and updation  start "+start+" end "+end);
		}
		System.out.println("-------------------------------------------------------------------------");

		int start;
		for(start=0;start<5;start++)
		{
			System.out.println("Inside loop start "+start);
		}
		System.out.println("Intialization outside loop accesing start variable outside loop start is "+start);
		System.out.println("-------------------------------------------------------------------------");

		int start1=1;
		for(;start1<5;start1++)
		{
			System.out.println("Initialization outside loop "+start1);
		}
		System.out.println("-------------------------------------------------------------------------");

		int x=1;
		for(;x<5;)
		{
			System.out.println("Updation inside For loop");
			x++;
		}
		System.out.println("-------------------------------------------------------------------------");

		
	}
}