import java.util.Scanner;

public class PossibleHandshakes {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int students = sc.nextInt();
        System.out.println("no. of hand shakes: "+(students*(students-1))/2);
    }
}
