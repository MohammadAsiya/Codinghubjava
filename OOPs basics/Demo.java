import java.util.*;
class Demo
{
	public static void main(String args[])
	{
		Demo d = new Demo();
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println(d.getClass());
		System.out.println(r.getClass());
		System.out.println(sc.getClass());
		int a []= new int[1];
		System.out.println(a.getClass());
	}
}