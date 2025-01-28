import java.util.Scanner;

public class Q2_sum {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("recursive sum: "+ sumRec(a));
        System.out.println("sum using formula: "+ sum(a));
    }

    static int sum(int n)
    {
        return (n*(n+1)/2);
    }
    static int sumRec(int n)
    {
        if(n==0)
        return 0;
        return n+sumRec(n-1);
    }
}