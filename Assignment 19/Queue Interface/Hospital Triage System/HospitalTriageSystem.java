import java.util.*;

class HospitalTriageSystem{
		
	PriorityQueue<Patient> pq;
		
	HospitalTriageSystem(){
	
		pq = new PriorityQueue<>(new Comparator<Patient>(){
			public int compare(Patient p1, Patient p2){
				return p1.severity - p2.severity;
			}
		});
	
	}

	public void add(Patient p){
	
		pq.add(p);
	
	}
	
	public void simulate(){
	
		System.out.println("Order in which the patients will be treated is : ");
		
		Stack<Patient>st = new Stack<>();
		
		while(!pq.isEmpty()){
			
			Patient p = pq.poll();
			System.out.println(p.name);
			st.push(p);
		}
		while(!st.isEmpty()){
			
			Patient p = st.pop();
			pq.add(p);
		}
		
	}
}
