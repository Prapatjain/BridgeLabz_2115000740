import java.util.Scanner;

public class Q10_SumTill0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s=0;
        while(true)
        {
            double d= sc.nextDouble();
            s+=d;
            if(d==0)
            {
                System.out.println("sum= "+s);
                return;
            }
        }
    }
}
