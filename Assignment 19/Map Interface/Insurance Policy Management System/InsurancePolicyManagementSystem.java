import java.util.*;

public class InsurancePolicyManagementSystem {
    HashMap<Integer, Policy> policyMap;
    LinkedHashMap<Integer, Policy> orderedPolicies;
    TreeMap<Date, Policy> sortedPolicies;

    InsurancePolicyManagementSystem() {
        this.policyMap = new HashMap<>();
        this.orderedPolicies = new LinkedHashMap<>();
        this.sortedPolicies = new TreeMap<>();
    }

    public void addPolicy(Policy p) {
        if (policyMap.containsKey(p.policyNumber)) {
            System.out.println("Duplicate Policy Number. Cannot Add.");
            return;
        }
        policyMap.put(p.policyNumber, p);
        orderedPolicies.put(p.policyNumber, p);
        sortedPolicies.put(p.expiryDate, p);
    }

    public void retrieveByPolicyNumber(int policyNumber) {
        if (policyMap.containsKey(policyNumber)) {
            policyMap.get(policyNumber).display();
        } else {
            System.out.println("Policy not found.");
        }
    }

    public void retrieveExpiringSoon() {
        Date currentDate = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(currentDate);
        cal.add(Calendar.DAY_OF_MONTH, 30);
        Date threshold = cal.getTime();

        for (Map.Entry<Date, Policy> entry : sortedPolicies.entrySet()) {
            if (entry.getKey().before(threshold)) {
                entry.getValue().display();
            }
        }
    }

    public void retrieveByPolicyholder(String name) {
        for (Policy p : policyMap.values()) {
            if (p.policyHolderName.equals(name)) {
                p.display();
            }
        }
    }

    public void removeExpiredPolicies() {
        Date currentDate = new Date();
        sortedPolicies.entrySet().removeIf(entry -> entry.getKey().before(currentDate));
    }
}
