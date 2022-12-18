public class shop_information {
    public static void main(String[] args) {
        int applePrice=100 , orangePrice=120 , lemonPrice=150; //به ازا هر کیلو گرم
        int appleAmout=10 , orangeAmout=20 , lemonAmount=15; //واحد:کیلوگرم
        int appleCost=appleAmout*applePrice, orangeCost=orangeAmout*orangePrice, lemonCost=lemonAmount*lemonPrice; 
        int total=appleCost+orangeCost+lemonCost , off=10 ;//تخفیف بر حسب درصد و قیمت بر حسب دلار
        int shouldPay=(total/100)*90;
        System.out.println("Your receipt:");
        System.out.println("Apple =" +appleCost);
        System.out.println("Orange =" +orangeCost  );
        System.out.println("Lemon =" +lemonCost);
        System.out.println("Total:"+ total);
        System.out.println("You should pay "+ shouldPay + "$ because of 10% off");
    }
}
