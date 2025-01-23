import java.util.Scanner;

public class Q1_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int temp=n;
        int s=0;
        while(n>0)
        {
            int a=n%10;
            s=s+a*a*a;
            n/=10;
        }
        if(temp==s)
        System.out.println(temp + " is armstrong number.");
        else
        System.out.println(temp + " is not a armstrong number.");
    }
}
