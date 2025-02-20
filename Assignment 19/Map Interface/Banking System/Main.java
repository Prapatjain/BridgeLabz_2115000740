public class Main {
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount(101, 5000);
        bank.createAccount(102, 3000);
        bank.createAccount(103, 10000);
        bank.createAccount(104, 2000);

        System.out.println("Before Withdrawals:");
        bank.displaySortedAccounts();

        bank.withdraw(101, 1000);
        bank.withdraw(103, 500);
        bank.withdraw(102, 3000);

        System.out.println("Processing Withdrawals...");
        bank.processWithdrawals();

        System.out.println("After Withdrawals:");
        bank.displaySortedAccounts();
    }
}
