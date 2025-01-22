import java.util.Scanner;

public class AreaOfTriange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextInt();
        double height = sc.nextInt();
        double areacm = 0.5*base*height;
        double baseInch = base/2.54;
        double heightInch = height/2.54;
        double areaInch = 0.5*baseInch*heightInch;
        System.out.println("Area of triange in square inches is "+areaInch+" and in square centimeters is "+areacm);
    }
}
