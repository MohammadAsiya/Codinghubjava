class chars
{
	public static void main(String args[])
	{
		char first='a';
                char second='A';
                if(first<97){
			first=(char)(first+32);
		}
		if(second<97)
		{
			second=(char)(second+32);
		}
                if(first==second)
		{
			System.out.println("Both are same");
		}
                else
		{
			System.out.println("Both are Not same");	
		}
	}
}