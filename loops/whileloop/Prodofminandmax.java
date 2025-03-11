class Prodofminandmax
{
	public static void main(String args[])
	{
		int n=124583,mini=n%10,maxi=n%10;
		while(n>0)
		{
			int r=n%10;
			mini=(mini < r ? mini: r);
			maxi=(maxi > r ? maxi: r);
			n=n/10;
		} 
		System.out.println("Product of Maximum and minimum digit is "+(mini*maxi));
	}
}