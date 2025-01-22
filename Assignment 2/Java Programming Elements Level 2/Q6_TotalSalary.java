import java.util.Scanner;

public class Q6_TotalSalary {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double salary = sc.nextDouble();
        double bonus = sc.nextDouble();
        System.out.println("total income: "+(salary+bonus));
    }
}
