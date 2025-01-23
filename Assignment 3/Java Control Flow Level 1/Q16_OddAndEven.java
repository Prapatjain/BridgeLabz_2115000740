import java.util.Scanner;

public class Q16_OddAndEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            if(n%2==0)
            System.out.println(n+" is even");
            else
            System.out.println(n+" is odd");
            n--;
        }
        
    }
}
