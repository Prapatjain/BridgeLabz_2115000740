import java.util.*;

class UnionAndIntersection{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> hs1 = new HashSet<>();
		HashSet<Integer> hs2 = new HashSet<>();
		
		System.out.println("Enter the size of first HashSet");
		int n = sc.nextInt();
		System.out.println("Enter the elements of first HashSet");
		
		for(int i=0;i<n;i++){
			hs1.add(sc.nextInt());
		}
		
		System.out.println("Enter the size of second HashSet");
		int m = sc.nextInt();
		System.out.println("Enter the elements of second HashSet");
		
		
		for(int i=0;i<m;i++){
			hs2.add(sc.nextInt());
		}
		
		HashSet<Integer> hs3 = new HashSet<>();
		
		//intersection 
		for(int i:hs1){
			if(hs2.contains(i))
				hs3.add(i);
		}
		
		//union
		for(int i:hs1)
			hs2.add(i);
			
		System.out.println("Union of two sets is : "+hs2);
		System.out.println("Intersection of two sets is : "+hs3);
		
	
	}


}