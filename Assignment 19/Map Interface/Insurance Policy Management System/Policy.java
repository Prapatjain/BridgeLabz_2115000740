import java.util.*;

class Policy {
    int policyNumber;
    String policyHolderName;
    Date expiryDate;
    String coverageType;
    int premiumAmount;

    Policy(int policyNumber, String policyHolderName, Date expiryDate, String coverageType, int premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public void display() {
        System.out.println("Policy Number: " + policyNumber);
        System.out.println("Policy Holder: " + policyHolderName);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Coverage Type: " + coverageType);
        System.out.println("Premium Amount: " + premiumAmount);
        System.out.println();
    }
}
