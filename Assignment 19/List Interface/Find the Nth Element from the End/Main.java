import java.util.*;
class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> l1 = new LinkedList<>();
		LinkedList<Integer> l2 = new LinkedList<>();
		
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		
		System.out.println("Enter the "+n+" elements");
		
		for(int i=0;i<n;i++){
			l1.add(sc.next());
		}
		
		
		int k = sc.nextInt();
		
		l1.findFromLast(k);
			
	
	}

}