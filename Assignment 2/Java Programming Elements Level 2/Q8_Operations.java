import java.util.Scanner;
//question does not define clearly
public class Q8_Operations {
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
