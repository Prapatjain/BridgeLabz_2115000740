import java.util.*;
class Q10_PowerOfANumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		for(int i=1;i<=number;i++){
			result *= number;
		}
		System.out.println("Result is : "+result);
	}
}