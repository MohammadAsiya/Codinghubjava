class  Studentgrade
{
	public static void main(String args[])
	{
		int sub1=100,sub2=79,sub3=98,sub4=34,sub5=96,sub6=56;
		int total=sub1+sub2+sub3+sub4+sub5+sub6;
		int totalpercentage=total/6;
		if(sub1<35 || sub2<35||sub3<35||sub4<35||sub5<35||sub6<35){
				System.out.println("Fail");
		}
		else if(totalpercentage>100)
		{
			System.out.println("Invalid");
		}
		else if(totalpercentage>=90)
			System.out.println("Grade A+");
		else if(totalpercentage>=80)
			System.out.println("Grade A");
		else if(totalpercentage>=70)
			System.out.println("Grade B");
		else if(totalpercentage>=60)
			System.out.println("Grade C");
		else if(totalpercentage>=50)
			System.out.println("Grade D");
		else
			System.out.println("Pass");
		}
}