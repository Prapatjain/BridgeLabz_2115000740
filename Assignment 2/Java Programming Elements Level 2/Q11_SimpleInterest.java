import java.util.Scanner;

public class Q11_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double principal =sc.nextDouble();
        double rate = sc.nextDouble();
        double time = sc.nextDouble();
        double simpleInterest = (principal*rate*time)/100;
        System.out.println("The Simple Interest is "+simpleInterest+" for Principal "+principal+", rate of Interest "+rate+" and Time "+time);
    }
}
