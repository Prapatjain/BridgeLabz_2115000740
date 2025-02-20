import java.util.*;

public class InvertMap {
    public static <K, V> Map<V, List<K>> invert(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            K key = entry.getKey();
            
            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("A", 1);
        input.put("B", 2);
        input.put("C", 1);
        
        System.out.println(invert(input)); // Output: {1=[A, C], 2=[B]}
    }
}
