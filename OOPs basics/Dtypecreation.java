class Date{
	int day;
	int month;
	int year;

	Date(int day, int month, int year){
     		this.day = day;
     		this.month = month;
     		this.year = year;
	}
	void printDate()
	{
		System.out.println(this.day+" / "+this.month+"/ "+this.year);
	}
}
class Person
{
	int id;
	String name;
	Date dob;
		
	Person(int id,String name,Date dob)
	{
		this.id=id;
		this.name=name;
		this.dob=dob;
	}
}
class Dtypecreation
{
	public static void main(String args[])
	{
		Date d =new Date(1,11,2004);
		Person  A = new Person(79,"Asiya",d);
		System.out.println("Person details"+A.id+" "+A.name);
		System.out.println(d.printDate());
	}
}