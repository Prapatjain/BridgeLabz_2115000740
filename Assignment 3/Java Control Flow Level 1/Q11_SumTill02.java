import java.util.Scanner;
public class Q11_SumTill02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s=0;
        while(true)
        {
            double d= sc.nextDouble();  
            if(d<=0 )
            {
                System.out.println("sum= "+s);
                break;
            }
            s+=d;
        }
    }
}
