import java.util.*;

class ReverseAQueue{

	public static void main(String[] args){
	
		Queue<Integer> q = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		
		int n = sc.nextInt();
	
		System.out.println("Enter "+n+" elements : ");
		
		for(int i=0;i<n;i++)
			q.add(sc.nextInt());
		
		reverse(q);
		
		System.out.println(q);
	}
	
	public static void reverse(Queue<Integer> q){
	
		if(q.isEmpty())
			return;
		
		int temp = q.poll();
		reverse(q);
		q.add(temp);
	
	}


}