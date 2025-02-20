import java.util.*;


class WordFrequency{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		HashMap<String, Integer> hm = new HashMap<>();
		
		String ans = "";
		for(int i=0;i<str.length();i++){
			
			if((str.charAt(i)<'a' || str.charAt(i)>'z')&&(str.charAt(i)<'A' || str.charAt(i)>'Z') ){
				if(ans.equals(""))
					continue;
				String ans2 = ans.toLowerCase();
				
				if(hm.containsKey(ans2))
					hm.put(ans2, hm.get(ans2)+1);
				else
					hm.put(ans2, 1);
				
				ans = "";
			}
			else
				ans += str.charAt(i);
		
		}
		if(!ans.equals("")){
			String ans2 = ans.toLowerCase();
				
			if(hm.containsKey(ans2))
				hm.put(ans2, hm.get(ans2)+1);
			else
				hm.put(ans2, 1);
		}
		
		System.out.println(hm);
	
	}


}