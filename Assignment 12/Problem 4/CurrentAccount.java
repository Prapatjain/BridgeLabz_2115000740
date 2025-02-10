class CurrentAccount extends BankAccount implements Loanable{
	
	CurrentAccount(int accountNumber, String holderName, double balance){
		super(accountNumber, holderName, balance);
	}
	
	public void calculateInterest(){
		System.out.println("Interest amount for this bank account is : "+(0.025*getBalance()));
	}

	public void applyForLoan(int amount){
		if(calculateLoanEligibility(amount))
			System.out.println("Applied for Loan");
		else
			System.out.println("Do not meet the Loan Eligibility criteria");
	}
	
	public boolean calculateLoanEligibility(int amount){
		if(amount <= 3*getBalance())
			return true;
		else
			return false;
	}
}