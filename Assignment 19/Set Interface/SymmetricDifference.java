import java.util.*;

class SymmetricDifference{

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
		
		for(int i:hs1){
			if(!hs2.contains(i))
				hs3.add(i);
		}
		
		for(int i:hs2){
			if(!hs1.contains(i))
				hs3.add(i);
		}
		
		System.out.println("Symmeetric Difference of given sets is : "+hs3);
	
	}


}