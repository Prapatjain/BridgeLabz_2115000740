import java.util.Scanner;

public class FeetsandInches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cm = sc.nextInt();
        double inches = cm/2.54;
        double feet = inches/12;
        System.out.println("Your Height in cm is "+cm+" while in feet is "+ feet+" and inches is "+inches);
    }
}
