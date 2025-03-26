
public class Cat {
	int age;
	String name;
	Cat(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	void display()
	{
		System.out.println(age+" "+name);
	}
	public static void main(String args[])
	{
		Cat c =new Cat(10,"Unknown");
		c.display();
	}
}