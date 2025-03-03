public class product {
    public static void main(String[] args) {
        String productname="Top";
        int price=1012;
        System.out.println("Product price"+price);
        byte quantity=3;
        System.out.println("Number of items"+quantity);
        int discountper=10;
        System.out.println("Discount"+discountper+"%");
        long coupencode=5678909;
        short coupencount=20;
        int coupenvalue=2;
        int taxper=14;
        int tot=price*quantity;
        boolean ordered=true;
        int discount=(int)(discountper/tot)*100;
        int coupenprice=coupencount*coupenvalue;
        System.out.println("Coupens price"+coupenprice);
        int tax=(int)(taxper/tot)*100;
        System.out.println("Tax"+tax);
        int sellingprice=tot-coupenprice-discount+tax;
        System.out.println("Final Amount "+sellingprice);

         }
}
