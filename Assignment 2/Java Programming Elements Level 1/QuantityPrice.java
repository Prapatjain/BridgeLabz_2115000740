import java.util.Scanner;

public class QuantityPrice {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double price = sc.nextDouble();
        int qty = sc.nextInt();
        System.out.println("total amount "+price*qty);
    }
}
