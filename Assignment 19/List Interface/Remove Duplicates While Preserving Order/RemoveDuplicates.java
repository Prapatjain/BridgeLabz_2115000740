import java.util.*;

class RemoveDuplicates{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		List<Integer> l1 = new ArrayList<>();
		HashSet<Integer> hs = new HashSet<>();
		
		List<Integer> l2 = new ArrayList<>();
		
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter "+n+" elements");
		
		for(int i=0;i<n;i++){
			l1.add(sc.nextInt());
			
			if(!hs.contains(l1.get(i))){
				l2.add(l1.get(i));
				hs.add(l1.get(i));
			}
		}
		
		for(int i=0;i<l2.size();i++){
			System.out.print(l2.get(i)+" ");	
		}
	
	}


}