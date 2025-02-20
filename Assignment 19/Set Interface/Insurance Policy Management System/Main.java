class Main{

	public static void main(String[] args){
	
		Policy p1 = new Policy(1, "Prapat", 25, "Health", 5);
		Policy p2 = new Policy(2, "Nihit", 40, "Auto", 3);
		Policy p3 = new Policy(1, "Prapat", 25, "Auto", 5);
		Policy p4 = new Policy(1, "nihit", 25, "Health", 5);
		Policy p5 = new Policy(3, "Prapat", 25, "Health", 5);
		
		InsurancePolicyManagementSystem i1 = new InsurancePolicyManagementSystem();
		
		i1.add(p1);
		i1.add(p2);
		i1.add(p3);
		i1.add(p4);
		i1.add(p5);
		
		i1.retrieveAllUnique();
		
		i1.retrieveExpiring();
		
		i1.retrieveCoverage("Health");
		
		i1.retrieveDuplicates(1);
	}

}