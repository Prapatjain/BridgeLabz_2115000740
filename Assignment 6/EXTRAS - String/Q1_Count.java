import java.util.*;

public class Q1_Count{ //CountVowelsAndConsonents
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //taking input
        System.out.println("Enter a String:");
        String str = sc.next();

        int c = 0;
        int v = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
                    || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                v++;
            } else {
                c++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonents: " + c);

        sc.close();
    }
}