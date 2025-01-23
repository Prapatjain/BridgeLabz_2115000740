import java.util.Scanner;

public class Q5_GregorianCalender {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter year:");
        int y= sc.nextInt();
        System.out.println("enter month:");
        int m= sc.nextInt();
        System.out.println("enter day:");
        int d= sc.nextInt();

        int yy = y-(14-m)/12;
        int x = yy + (yy/4) - (yy/100) + (yy/400);
        int mm = m + 12 * ((14 - m) / 12) - 2;
        int dd = (d + x + 31*mm / 12) % 7;

        switch(dd){
            case 1:
            System.out.println("MONDAY");
            break;
            case 2:
            System.out.println("TUESDAY");
            break;
            case 3:
            System.out.println("WEDNESDAY");
            break;
            case 4:
            System.out.println("THURSDAY");
            break;
            case 5:
            System.out.println("FRIDAY");
            break;
            case 6:
            System.out.println("SATURDAY");
            break;
            case 0:
            System.out.println("SUNDAY");
            break;
            default:
            System.out.println("Something went wrong- "+dd);
        }
    }
}
