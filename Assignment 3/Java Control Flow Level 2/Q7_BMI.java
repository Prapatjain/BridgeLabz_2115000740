import java.util.*;
class Q7_BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double weight = sc.nextDouble();
		double heightInCm = sc.nextDouble();
		//height conversion 
		double heightInM = heightInCm/1000;
		//calculating BMI
		double bmi = weight/(heightInM*heightInM);
		if(bmi >= 40)
			System.out.println("Obese");
		else if(bmi >= 25)
			System.out.println("Overweight");
		else if(bmi >= 18.5)
			System.out.println("Normal");
		else 
			System.out.println("Underweight");
	}
}