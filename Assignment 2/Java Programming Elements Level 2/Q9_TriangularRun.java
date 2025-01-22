import java.util.Scanner;

public class Q9_TriangularRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c= sc.nextInt();
        int totalLen= a+b+c;
        int rounds = totalLen/5;
        System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
    }
}
