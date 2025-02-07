class FixedDepositAccount extends BankAccount {
    private int lockInPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawals are not allowed in a Fixed Deposit Account until the lock-in period of " + lockInPeriod + " months is completed.");
    }

    public void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
    }
}