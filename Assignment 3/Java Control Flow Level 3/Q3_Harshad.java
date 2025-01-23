import java.util.Scanner;

public class Q3_Harshad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int c=0;
        while(n>0)
        {
            c=c+ n%10;
            n=n/10;
        }
        if(temp%c==0)
        System.out.println(temp+" is Harshad Number.");
        else
        System.out.println(temp+" is not a Harshad Number.");
    }
}
