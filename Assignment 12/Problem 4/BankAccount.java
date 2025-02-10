abstract class BankAccount{
	private int accountNumber;
	private String holderName;
	private double balance;
	
	BankAccount(int accountNumber, String holderName, double balance){
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}
	
	public void deposit(double amount){
		if(amount < 0)
			System.out.println("Invalid Amount");
		else
			this.balance += amount;
	}

	public void withdraw(double amount){
		if(amount > balance)
			System.out.println("Invalid Amount");
		else	
			this.balance -= amount;
	}
	
	abstract void calculateInterest();
	
	void setHolderName(String name){
		this.holderName = name;
	}
	
	int getAccountNumber(){
		return this.accountNumber;
	}
	
	String getHolderName(){
		return this.holderName;
	}
	
	double getBalance(){
		return this.balance;
	}
	
	public void displayDetails(){
		System.out.println("Account number is : "+this.accountNumber);
		System.out.println("Account Holder Name is : "+this.holderName);
		System.out.println("Account balance is : "+this.balance);
		
	}
}