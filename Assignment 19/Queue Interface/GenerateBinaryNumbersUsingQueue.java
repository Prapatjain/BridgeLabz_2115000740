import java.util.*;

class GenerateBinaryNumbersUsingQueue{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Queue<String> q = new LinkedList<>();
		
		System.out.println("Enter the number of binary number you want : ");
		
		int n = sc.nextInt();
		
		q.add("1");
		
		while(n-- > 1){
		
			String str = q.poll();
			
			q.add(str+"0");
			q.add(str+"1");
		
		}
		
		System.out.println(q.peek());
		
	}

}