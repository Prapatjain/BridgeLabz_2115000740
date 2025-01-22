public class UnivDiscount {
    public static void main(String[] args) {
        int fees = 125000;
        double disValue = 10;
        double disAmt = (125000*10)/100;
        double payableAmt = fees - disAmt;
        System.out.println("The discount amount is INR "+disAmt+" and final discounted fee is INR "+payableAmt);
    }
}
