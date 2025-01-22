import java.util.Scanner;

public class UnivDiscountIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fees = sc.nextInt();
        double disValue = sc.nextDouble();
        double disAmt = (125000*10)/100;
        double payableAmt = fees - disAmt;
        System.out.println("The discount amount is INR "+disAmt+" and final discounted fee is INR "+payableAmt);
    }
}
