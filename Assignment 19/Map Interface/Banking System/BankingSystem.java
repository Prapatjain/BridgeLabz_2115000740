import java.util.*;

public class BankingSystem {
    HashMap<Integer, Double> accounts;
    TreeMap<Double, Integer> sortedAccounts;
    Queue<Integer> withdrawalQueue;

    BankingSystem() {
        this.accounts = new HashMap<>();
        this.sortedAccounts = new TreeMap<>();
        this.withdrawalQueue = new LinkedList<>();
    }

    public void createAccount(int accountNumber, double balance) {
        accounts.put(accountNumber, balance);
        sortedAccounts.put(balance, accountNumber);
    }

    public void withdraw(int accountNumber, double amount) {
        if (accounts.containsKey(accountNumber) && accounts.get(accountNumber) >= amount) {
            accounts.put(accountNumber, accounts.get(accountNumber) - amount);
            withdrawalQueue.add(accountNumber);
        } else {
            System.out.println("Insufficient funds or account not found.");
        }
    }

    public void processWithdrawals() {
        while (!withdrawalQueue.isEmpty()) {
            int account = withdrawalQueue.poll();
            System.out.println("Processed withdrawal for account: " + account);
        }
    }

    public void displaySortedAccounts() {
        System.out.println("Accounts sorted by balance:");
        for (Map.Entry<Double, Integer> entry : sortedAccounts.entrySet()) {
            System.out.println("Account: " + entry.getValue() + " - Balance: $" + entry.getKey());
        }
    }
}
