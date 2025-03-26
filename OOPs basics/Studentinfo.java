

class Student1{
	int sid,roll;
	String name;
	Student1()
	{
		this.sid=1;
		this.name="Unknown";
		this.roll=31;
	}
	Student1(int sid,String name,int roll)
	{
		this.sid=sid;
		this.roll=roll;
		this.name=name;
	}
	void display()
	{
		System.out.println(sid+" "+name+" "+roll);
	}
}
public class Studentinfo
{
	public static void main(String[] args)
	{
		Student1 s1= new Student1();
		s1.display();
		Student1 s2=new Student1(21,"Alexa",34);
		s2.display();
	}
}

