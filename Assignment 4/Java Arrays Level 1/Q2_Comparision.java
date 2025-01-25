import java.util.*;
class Q2_Comparision{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[5];
		for(int i=0;i<numbers.length;i++)
			numbers[i] = sc.nextInt();
		for(int i=0;i<numbers.length;i++){
			if(numbers[i] > 0){
				if(numbers[i] % 2 == 0)
					System.out.println("the number "+numbers[i]+" is positive and even");
				else
					System.out.println("the number "+numbers[i]+" is positive and odd");
			}
			else if(numbers[i] < 0)
				System.out.println("The number "+numbers[i]+" is negative");
			else
				System.out.println("The number "+numbers[i]+" is zero");
		}
	}
}