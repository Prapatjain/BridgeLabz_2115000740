import java.util.Scanner;

public class Q10_ChocolateDis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalChocolates = sc.nextInt();
        int totalStudent = sc.nextInt();
        System.out.println("The number of chocolates each child gets is "+totalChocolates/totalStudent+" and the number of remaining chocolates are "+ totalChocolates%totalStudent);
    }
}
