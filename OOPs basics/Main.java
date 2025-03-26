class Main
{
	public static void main(String args[])
	{
		Student student1= new Student();
		student1.printData();
		Student student2=new Student(11,"Naveen","Naveen@gmail.com","A");
		student2.printData();
		Student student3 = new Student(12,"MK","MK@gmail.com","A");
		student3.printData();
	}
}
class Student
{
	int roll;
	String name,email,section;
	double marks;
	Student(int r,String n,String e,String s)
	{
		roll=r;
		name=n;
		email=e;
		section=s;
	}
	void printData()
	{
		System.out.println(roll+""+name+""email,section);
	}
}