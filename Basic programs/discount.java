class discount
{
	public static void main(String args[])
	{
		
		String pName="Fit and flare dress";
		long pCode=198703456;
		int ptotal=0;
		int price=1110;
		short quantity=2;
		int  discount=0;
		int discountprice=0;
		ptotal=price*quantity;
		System.out.println("Ptotal"+ptotal);
		if(ptotal<=0)
		{
			discount=0;
			discountprice=0;
		}
		else if(ptotal>=1000 && ptotal<2000)
		{
			discount=10;
			discountprice=(int)(10.0/100*ptotal);
			System.out.println(discountprice+"  disc ");
			if(discountprice>150)
				discountprice=150;
			
		}
		else if(ptotal>=2000 && ptotal<3000)
		{
			discount=15;
			discountprice=(int)(15.0/ptotal*100);
			if(discountprice>250)
				discountprice=250;
		}
		else if(ptotal>=3000 && ptotal<4000)
		{
			discount=20;
			discountprice=(int)(20.0/ptotal*100);
			if(discountprice>400)
				discountprice=400;
		}

		else 
		{
			discount=25;
			discountprice=(int)(25.0/ptotal*100);
			if(discountprice>500)
				discountprice=500;
		}

		int finaltotal=ptotal-discountprice;
		double tax=(18.0/finaltotal*100);
		System.out.println("Tax"+tax);
		int bill=finaltotal+(int)tax;
		System.out.println(pName);
		System.out.println("product code"+pCode );
		System.out.println("Discount price"+discountprice);


		System.out.println("Bill      = "+bill);
		
	}
}	