import java.util.*;
class Q10_FizzBuzz{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String[] array = new String[number+1];
		for(int i=0;i<=number;i++){
			if(i%3 == 0 && i%5 == 0)
				array[i] = "FizzBuzz";
			else if(i%3 == 0) 
				array[i] = "Fizz";
			else if(i%5 == 0)
				array[i] = "Buzz";
			else
				array[i] = String.valueOf(i);
		}
		for(int i=1;i<array.length;i++)
			System.out.println("Position "+i+" = "+array[i]);
	}
}