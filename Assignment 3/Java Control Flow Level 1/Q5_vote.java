import java.util.Scanner;

public class Q5_vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n>=18)
        System.out.println("The person's age is "+n+"  and can vote.");
        else
        System.out.println("The person's age is "+n+"  and can not vote.");
    }
}
