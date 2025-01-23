import java.util.Scanner;

public class Q2_Smallest {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
         if(a<b && a<c)
         System.out.println("First number is the smallest");
         else
         System.out.println("First number is not the smallest");
    }
}
