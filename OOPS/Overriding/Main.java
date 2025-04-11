class Main
{
	public static void main(String args[])
	{
		Parent parent;//Compile time loading  load all Parent Class Methods
		parent = new Child();//upcasting //run time
		parent.m1();
		//parent.m2();//compile time m2 not available
	}
}
class Parent
{
	public final void m1()//Compile time loading
	{
		System.out.println("PARENT -M1");
	}
}
class Child extends Parent
{
	public void m12()//Run time loading
	{
		System.out.println("CHILD - M1");
	}
	public void m2()//Run time loading
	{
		System.out.println("CHILD - M2");
	}


}