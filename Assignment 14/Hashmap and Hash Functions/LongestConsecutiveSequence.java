
import java.util.*;

public class LongestConsecutiveSequence {
    
    
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i] - 1)) {
                map.put(nums[i], false);
            } else {
                map.put(nums[i], true);
            }
            if (map.containsKey(nums[i] + 1)) {
                map.put(nums[i] + 1, false);
            }
        }
        int ans = 0;
        for (int key : map.keySet()) {
            if (map.get(key)) {
                int count = 0;
                while (map.containsKey(key)) {
                    count++;
                    key++;
                }
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        // int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
        int arr[] = { 2, 6, 1, 9, 4, 5, 3 };

        System.out.println(longestConsecutive(arr));
    }
    
}