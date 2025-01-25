import java.util.*;
class Q4_Total{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double array[] = new double[10];
		double total = 0.0d;
		int index = 0;
		while(true){
			if(index == 10)
				break;
			double input = sc.nextDouble();
			if(input <= 0)
				break;
			array[index] = input;
			index++;
		}
		for(int i=0;i<array.length;i++)
			total += array[i];
		System.out.println("Total is : "+total);	
	}
}