import java.util.Scanner;

public class Q5_TemperaturConversion2 {
    public static void main(String[] args) {
        //Fahrenheit to Celsius
        Scanner sc = new Scanner(System.in);
        double farenheit = sc.nextInt();
        double Celsius  =  (farenheit-32)*(9/5);
        System.out.println("Celsius : "+ Celsius);
    }
    
}
