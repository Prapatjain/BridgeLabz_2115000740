import java.util.*;
class Q1_Vote{
	public static void main(String[] args ){
		Scanner sc = new Scanner(System.in);
		int studentsAge[] = new int[10];
		for(int i=0;i<studentsAge.length;i++)
			studentsAge[i] = sc.nextInt();
		for(int i=0;i<studentsAge.length;i++){
			if(studentsAge[i] < 0)
				System.out.println("invalid age");
			else if(studentsAge[i] >= 18)
				System.out.println("The student with age "+studentsAge[i]+" can vote");
			else
				System.out.println("The student with age "+studentsAge[i]+" cannot vote");	
		}
	}
}