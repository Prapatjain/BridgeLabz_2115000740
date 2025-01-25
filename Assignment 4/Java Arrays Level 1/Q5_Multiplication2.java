import java.util.*;
class Q5_Multiplication2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int multiplicationResult[] = new int[4];
		for(int i=0;i<multiplicationResult.length;i++)
			multiplicationResult[i] = (i+6)*number;
		for(int i=0;i<multiplicationResult.length;i++)
			System.out.println(number+" * "+(i+6)+" = "+multiplicationResult[i]);
	}
}