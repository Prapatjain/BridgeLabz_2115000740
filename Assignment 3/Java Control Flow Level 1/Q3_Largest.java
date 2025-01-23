import java.util.Scanner;

public class Q3_Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean aa = false;
        boolean bb = false;
        boolean cc = false;
        if(a>b && a>c)
        aa=true;
        else if(b>a && b>c)
        bb= true;
        else
        cc= true;

        System.out.println("Is the first number the largest? " + aa);
        System.out.println("Is the second number the largest? "+bb);
        System.out.println("Is the third number the largest? "+cc);
    }
}
