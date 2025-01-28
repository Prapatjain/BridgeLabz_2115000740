import java.util.Scanner;

public class Q3_LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(leapYear(year));
    }
    static String leapYear(int a){
        String s="";
        if(a<1582)
        return a+" is below the mentioned reange(1852).";
        
        if((a%4==0 && a%100!=0) || (a%400==0))
        {
            s= a+" is the leap year."; 
            return s;
        }
        else
        {
            return a+" is not the leap year.";
        }
        
    }
}
