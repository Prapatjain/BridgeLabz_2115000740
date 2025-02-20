import java.util.*;

public class MaxKeyFinder {
    public static String findMaxKey(Map<String, Integer> map) {
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue || maxKey == null) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 10);
        input.put("B", 20);
        input.put("C", 15);

        System.out.println(findMaxKey(input)); // Output: B
    }
}
