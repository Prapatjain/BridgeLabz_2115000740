public class Main {
    public static void main(String[] args) {
        
        SavingsAccount savings = new SavingsAccount("SA12345", 1000, 5);
        CheckingAccount checking = new CheckingAccount("CA54321", 2000, 500);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD67890", 5000, 12);

       
        savings.displayAccountType();
        checking.displayAccountType();
        fixedDeposit.displayAccountType();

       
        System.out.println("\n--- Transactions ---");
        savings.deposit(500);
        savings.addInterest();
        savings.withdraw(200);

        System.out.println();
        checking.withdraw(600); 
        checking.withdraw(400);  

        System.out.println();
        fixedDeposit.withdraw(1000); 
    }
}
