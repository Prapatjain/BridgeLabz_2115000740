import java.util.Scanner;

public class Q2_IntOperation {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        System.out.println("Result of Int Operations are:");
        System.out.print(a + b *c +" , ");
        System.out.print( a * b + c+" , ");
        System.out.print( c + a / b+" , ");
        System.out.println( a % b + c);
    }
}
