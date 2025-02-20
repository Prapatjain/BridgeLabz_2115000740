import java.util.*;

public class Main {
    public static void main(String[] args) {
        InsurancePolicyManagementSystem system = new InsurancePolicyManagementSystem();

        system.addPolicy(new Policy(1, "Alice", new Date(2024, 8, 15), "Health", 5000));
        system.addPolicy(new Policy(2, "Bob", new Date(2024, 9, 5), "Auto", 3000));
        system.addPolicy(new Policy(3, "Alice", new Date(2024, 7, 20), "Home", 7000));

        System.out.println("Policies expiring within 30 days:");
        system.retrieveExpiringSoon();

        System.out.println("Policies for Alice:");
        system.retrieveByPolicyholder("Alice");
    }
}
