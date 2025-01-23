import java.util.Scanner;

public class Q4_Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int s =0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            s+=i;
        }
        if(s>n)
        System.out.println(n+" is the abundant number.");
        else 
        System.out.println(n+" is not the abundant number.");
    }
}
