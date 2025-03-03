class Profit
{
	public static void main(String args[])
	{
	  	int costprice=1000;
		int sellingprice=1200;
		if(sellingprice>costprice)
		{
			int profit=sellingprice-costprice;
			System.out.println("Seller got profit  the profit is :"+profit);
		}
		else if(sellingprice <costprice)
		{
			int loss=costprice-sellingprice;
			System.out.println("Seller got loss the loss is : "+loss); 
		}
		else
			System.out.println("No profit and No loss");
	
	}
}