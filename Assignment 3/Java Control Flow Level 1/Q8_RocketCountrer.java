import java.util.Scanner;

public class Q8_RocketCountrer {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        if(m==1)
    {    System.out.println("Rocket Launched");
        return;}
        while(m>0)
        {
            System.out.println(m--);
        }
        System.out.println("Rocket Launched");
    }
}
