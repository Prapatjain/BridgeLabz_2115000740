import java.util.*;
class Q4_Prime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<number;i++){
			if(number%i == 0){
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println("The number is Prime");
		else
			System.out.println("The number is not Prime");
	}
}