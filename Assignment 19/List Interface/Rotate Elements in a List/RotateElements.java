import java.util.*;


class RotateElements{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		List<Integer> l1 = new ArrayList<>();
		
		System.out.println("Enter "+n+" elements : ");
		
		for(int i=0;i<n;i++)
			l1.add(sc.nextInt());
			
		System.out.println("Enter the times list to be rotated");
		int k = sc.nextInt();
		
		k = k%n;
		
		while(k>0){
			
			int temp = l1.get(0);
			l1.remove(0);
			l1.add(temp);
			k--;
		}
		for(int i=0;i<l1.size();i++){
			System.out.print(l1.get(i)+" ");
		}

	}
	

}