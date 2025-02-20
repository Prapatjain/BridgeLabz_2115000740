import java.util.*;

class SetToASortedList{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
	
		List<Integer> l1 = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		
		System.out.println("Enter the size of HashSet");
		int n = sc.nextInt();
		System.out.println("Enter the elements of HashSet");
		
		for(int i=0;i<n;i++){
			hs.add(sc.nextInt());
		}
		
		for(int i:hs)
			l1.add(i);
		
		Collections.sort(l1);
		System.out.println(l1);
	}

}