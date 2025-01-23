import java.util.Scanner;

public class Q14_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1;
        while(n>0){
            p=p*n;
            n--;
        }
        System.out.println(p);
    }
}
