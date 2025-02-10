import java.util.*;
class Main{
	public static void main(String[] args){
		BankAccount s1 = new SavingsAccount(23892229, "Kushagra Sharma", 10000000);
		
		BankAccount c1 = new CurrentAccount(84720019, "Naman Agarwal", 5000000);
		
		List<BankAccount> l1 = new ArrayList<>();
		l1.add(s1);
		l1.add(c1);
		
		for(int i=0;i<l1.size();i++){
			l1.get(i).displayDetails();
			
			if(l1.get(i) instanceof SavingsAccount){
				((SavingsAccount)l1.get(i)).calculateInterest();
				((SavingsAccount)l1.get(i)).applyForLoan(30000000);
				
			}
			if(l1.get(i) instanceof CurrentAccount){
				((CurrentAccount)l1.get(i)).calculateInterest();
				((CurrentAccount)l1.get(i)).applyForLoan(1000000000);
				
			}
			l1.get(i).displayDetails();
			
			
		}
		
	}


}