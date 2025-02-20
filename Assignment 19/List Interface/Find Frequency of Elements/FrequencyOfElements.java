import java.util.*;
class FrequencyOfElements{

	public static void main(String[] args){
	
		List<String> l1 = new ArrayList<>();
		HashMap<String, Integer> hm = new HashMap<>();
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the list");
		int n = sc.nextInt();
		
		System.out.println("Enter "+n+" Strings");
		
		for(int i=0;i<n;i++){
			l1.add(sc.next());
			
			if(hm.containsKey(l1.get(i)))
				hm.put(l1.get(i), hm.get(l1.get(i))+1);
			else
				hm.put(l1.get(i), 1);
		}
		
		System.out.println(hm);
	}



}