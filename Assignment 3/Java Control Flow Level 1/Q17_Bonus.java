import java.util.Scanner;

public class Q17_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary:");
        int salary = sc.nextInt();
        System.out.println("Enter years of service:");
        int y = sc.nextInt();
        int bonus =0;
        if(y>5)
        bonus = (salary*5)/100;
        System.out.println("Bonus= "+bonus);

    }
}
