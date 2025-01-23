import java.util.Scanner;

public class Q6_Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println(" ");
        System.out.println("press 1 for  addition, 2 for substraction, 3 for division, and 4 for multiplication");
        int n =sc.nextInt();
        System.out.println("enter first value:");
        int a1 = sc.nextInt();
        System.out.println("enter second value:");
        int a2 = sc.nextInt();
        switch(n){
            case 1:
            System.out.println(a1+a2);
            break;
            case 2:
            System.out.println(a2-a1);
            break;
            case 3:
            System.out.println(a2/a1);
            break;
            case 4:
            System.out.println(a1*a2);
            break;
            default:
            System.out.println("enter correct input.");
        }
    }
}
