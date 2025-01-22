import java.util.Scanner;

public class Q3_DoubleOpt {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double a =sc.nextInt();
        double b =sc.nextInt();
        double c =sc.nextInt();
        System.out.println("Result of Int Operations are:");
        System.out.print(a + b *c +" , ");
        System.out.print( a * b + c+" , ");
        System.out.print( c + a / b+" , ");
        System.out.println( a % b + c);
    }
}
