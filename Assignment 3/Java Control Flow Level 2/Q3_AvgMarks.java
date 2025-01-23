import java.util.*;
class Q3_AvgMarks{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double physics = sc.nextDouble();
		double chemistry = sc.nextDouble();
		double maths = sc.nextDouble();
		double avgMarks = (physics+chemistry+maths)/3;
		if(avgMarks>=80)
			System.out.println("Average marks : "+avgMarks+"\nGrade : A\nRemarks : Level 4, above agency-normalised standards");
		else if(avgMarks>=70)
			System.out.println("Average marks : "+avgMarks+"\nGrade : B\nRemarks : Level 3, at agency-normalised standards");
		else if(avgMarks>=60)
			System.out.println("Average marks : "+avgMarks+"\nGrade : C\nRemarks : Level 2, below,but approaching agency-normalised standards");
		else if(avgMarks>=50)
			System.out.println("Average marks : "+avgMarks+"\nGrade : D\nRemarks : Level 1, well below agency-normalised standards");
		else if(avgMarks>=40)
			System.out.println("Average marks : "+avgMarks+"\nGrade : E\nRemarks : Level 1-, too below agency-normalised standards");
		else
			System.out.println("Average marks : "+avgMarks+"\nGrade : R\nRemarks : Remedial standards");
	}
}
