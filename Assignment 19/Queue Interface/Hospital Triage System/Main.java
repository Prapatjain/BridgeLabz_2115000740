class Main{

	public static void main(String[] args){
	
		Patient p1 = new Patient("Kushagra", 12);
		Patient p2 = new Patient("Aman", 1);
		Patient p3 = new Patient("Rohit", 2);
		
		HospitalTriageSystem hs = new HospitalTriageSystem();
		
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		
		hs.simulate();
	
	}

}