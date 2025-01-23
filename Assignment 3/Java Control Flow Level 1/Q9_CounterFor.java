import java.util.Scanner;

public class Q9_CounterFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m==1)
    {    System.out.println("Rocket Launched");
        return;}
        for(;m>=1;m--)
        {
            System.out.println(m);
        }
    }
}
