import java.util.Scanner;

public class Q6_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        System.out.println("Negative");
        else if(n>0)
        System.out.println("Positive");
        else
        System.out.println("zero");
    }
}
