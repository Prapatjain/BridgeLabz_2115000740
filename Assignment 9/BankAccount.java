public class BankAccount {
     String accountHolderName;
     final long accountNumber;
    static String bankName = "SBI";
    static int TotalAccount=0;

    BankAccount(String accountHolderName, long accountNumber){ //Parameterized constructor

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        TotalAccount++;
    }
    static void getTotalAccounts(){
        System.out.println("Total number of accounts: "+TotalAccount);
    }

    void displayDetails(Object b){  //instance of operator
        if(b instanceof BankAccount)
        {    System.out.println("\nBank Name: "+bankName);
            System.out.println("Account Holder Name: "+ accountHolderName);
            System.out.println("Account Number: "+accountNumber);
        }
        else
        System.out.println("Not an instance of the BankAccount class.");
    }
}
