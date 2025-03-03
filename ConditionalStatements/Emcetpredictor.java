class Emcetpredictor
{
	public static void main(String args[])
	{
		int marks=80;
		String category="general";
		int rank=0;
           	String college="";
		String branch="";
		Boolean qualification=true;
		if(category=="general"){
			if(marks>40)
				qualification=true;
		}
		else if(category=="obc"){
			if(marks>35)
				qualification=true;
		}
  		else{ 
			qualification=true;
		}
		if(marks>150)
		{
			rank=10;
			college="Andhra University College of Engineering";
			branch="CSE/ECE/AIML/IT/EEE/MECH/ML/DS";
		}
		else if(marks>140)
		{
			rank=50;
			college="VIT-AP University";
			branch="CSE/ECE/IT/EEE/MECH/ML/DS";
		}
		else if(marks>130)
		{
			rank=100;
			college="JNTUK Kakinada";
			branch="CSE/ECE/EEE/MECH/IT/CIVIL";
		}
		else if(marks>120)
		{
			rank=500;
			college="GVPCE Visakhapatnam";
			branch="CSE/ECE/MECH/CIVIL/IT/EEE/CHEMICAL";
		}

		else if(marks>110)
		{
			rank=800;
			college="SVUCE Tirupati";
			branch="CSE/ECE/MECH/CIVIL/ECE/CHEMICAL";
		}
		else if(marks>100)
		{
			rank=1500;
			college=" SRM University";
 			branch="CSE/ECE/IT/EEE/MECH/CIVIL/CHEMICAL";
		}
		else if(marks>90)
		{
			rank=5000;
			college="GVPCE Visakhapatnam";
			branch="CSE/ECE/EEE/MECH/CIVIL";
		}
		else if(marks>80)
		{
			rank=10000;
			college="Sri Venkateswara Institute of Science and Technology";
			branch="CSE/ECE/EEE/MECH/CIVIL";
		}
		else if(marks>70)
		{
			rank=20000;
			college="VRSEC Vijayawada";
			branch="CSE/ECE/EEE/MECH/CIVIL";
		}
		else if(marks>60)
		{
			rank=50000;
			college="RGMCET Kurnool";
			branch="CSE/ECE/EEE/MECH/CIVIL";
		}
		else if(marks>50)
		{
			rank=80000;
			college="Vikas College of Engineering and Technology";
			branch="ECE/EEE/MECH/CIVIL";
		}

		else 
		{
			rank=120000;
			college="Others";
			branch="MECH/CIVIL";
		}
		if(qualification)
		{
			System.out.println("You are qualified for emcet and your predicted rank is :  "+rank);
			System.out.println("You may get  :"+ college+"Branch :"+branch);
			
		}
			
		
			
	}
}