class Productprogram{
	public static void main(String args[]){
		String carmodel="Fortuner";
                double price =337800;
		byte star=5;
		Boolean automatic=true;
		int powerbhp=201;
                long milage=10000;
		char fueltype='G';
		String color="Blue";
		float taxpercentage=0.08f;
		int discountpercentage=5;
                int discount = (int)(discountpercentage/price*100);
		double tax=taxpercentage/price*100;
		double registrationfee =5000;
                long vipnumber=10000;
                String carnumber="AP168888";
                int totalprice=(int)(price-discount+tax+vipnumber+registrationfee);
		System.out.println("Car Model is : "+carmodel);
		System.out.println("Car color"+color);
		System.out.println("Car Price : "+price);
		System.out.println("Automatic : "+automatic);
		System.out.println("Power(Bhp) : "+powerbhp);
		System.out.println("Milage : "+milage);
		System.out.println("Fueltype : "+fueltype);
		System.out.println("Tax  : "+taxpercentage+"%");

		if(totalprice>=100000 && totalprice<200000)
			discountpercentage=10;
		else if(totalprice>=200000 && totalprice<300000)
			discountpercentage=15;
		else if(totalprice>=300000 && totalprice<400000)
			discountpercentage=20;
		
			

		System.out.println("Discount : "+discountpercentage+"%");
		System.out.println("Discount Price : "+(int)(price-discount));
		System.out.println("Tax : "+tax);
		System.out.println("Registration fee : "+registrationfee);
		System.out.println("Vipnumber plate price : "+vipnumber);
		System.out.println("Number Plate : "+carnumber);

		String p="Gpay";
                System.out.println("Payment method"+p);
                if(p=="Gpay"){
			totalprice=(totalprice-(10/totalprice*100));
		}
                if(p=="Ppay"){
		        totalprice=(totalprice-(8/totalprice*100));
		}
                int G=(int)(10/price*100);
		System.out.println("Gpay discount price : "+G);
		System.out.println("Total Amount : "+totalprice);
	}
}