import java.util.Scanner;

public class Q4_NaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>0)
        System.out.println(
        "The sum of " +n+" natural numbers is "+(n*(n+1))/2);
        else
        System.out.println(" The number is not the natural number.");
    }
}
