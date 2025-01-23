import java.util.Scanner;

public class Q12_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int s=0;
        System.out.println( "The sum of " +n+" natural numbers using formula is "+(n*(n+1))/2);
        while(n>0)
        {
            s+=n;
            n--;
        }  
        System.out.println("The sum of "+temp+" natural numbers using while loop is "+s);
    }
}
