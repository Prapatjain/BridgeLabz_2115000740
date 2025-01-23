import java.util.Scanner;

public class Q7_Spring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter month and day");
        int m = sc.nextInt();
        int d = sc.nextInt();

        if(m>=3 && d>=20 )
        {
            if(m<=6 && d<=20)
            {
                System.out.println(" Its a spring season");
                return;
            }
        }
        System.out.println("Its not spring season.");
    }
}
