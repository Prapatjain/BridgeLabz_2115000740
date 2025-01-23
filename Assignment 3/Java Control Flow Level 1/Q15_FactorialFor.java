import java.util.Scanner;

public class Q15_FactorialFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p=1;
        for(;n>0;n--){
            p=p*n;
        }
        System.out.println(p);
    }
}
