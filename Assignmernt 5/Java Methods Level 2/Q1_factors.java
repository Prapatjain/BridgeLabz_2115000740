
import java.util.Scanner;

public class Q1_factors {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            s++;
        }
        int arr[] = new int[s];
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            arr[i-1]=i;
        }

        System.out.println("Entered array:");
        for(int i:arr)
        {
            System.out.print(i+" , ");
        }
        System.out.println("sum= "+sum(arr));
        System.out.println("product= "+product(arr));
        System.out.println("Sum of Squares = " +sumOfSq(arr));
    }
    public static int sum(int a[])
    {
        int s=0;
        for(int i:a)
        {
            s+=i;
        }
        return s;
    }
    public static int product(int a[])
    {
        int s=1;
        for(int i:a)
        {
            s*=i;
        }
        return s;
    }
    public static int sumOfSq(int a[])
    {
        int s=0;
        for(int i:a)
        {
            s+=Math.pow(i, 2);
        }
        return s;
    }
}
