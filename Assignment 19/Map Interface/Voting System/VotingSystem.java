import java.util.*;

public class VotingSystem {
    HashMap<String, Integer> votes;
    LinkedHashMap<String, Integer> orderedVotes;
    TreeMap<String, Integer> sortedVotes;

    VotingSystem() {
        this.votes = new HashMap<>();
        this.orderedVotes = new LinkedHashMap<>();
        this.sortedVotes = new TreeMap<>();
    }

    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        orderedVotes.put(candidate, orderedVotes.getOrDefault(candidate, 0) + 1);
        sortedVotes.put(candidate, sortedVotes.getOrDefault(candidate, 0) + 1);
    }

    public void displayResults() {
        System.out.println("Sorted Results:");
        for (Map.Entry<String, Integer> entry : sortedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }
}
