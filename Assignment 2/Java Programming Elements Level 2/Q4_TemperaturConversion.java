import java.util.Scanner;

public class Q4_TemperaturConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double celc = sc.nextInt();
        double farenheitResult  =  (celc*9/5) +32;
        System.out.println("farenheit : "+ farenheitResult);
    }
}
