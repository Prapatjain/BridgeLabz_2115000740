import java.util.*;
class Q9_GreatestFactor{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int greatestFactor = 1;
		for(int i=number-1;i>=1;i--){
			if(number%i == 0){
				greatestFactor = i;
				break;
			}
		}
		System.out.println("GreatestFactor is : "+greatestFactor);
	}
}