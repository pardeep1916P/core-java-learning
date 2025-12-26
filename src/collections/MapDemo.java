package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Demonstrates Map interface implementations.
 * Maps store key-value pairs.
 */
public class MapDemo {
    public static void main(String[] args) {
        // HashMap - no order guarantee
        System.out.println("=== HashMap ===");
        Map<String, Integer> hashMap = new HashMap<>();
        
        hashMap.put("Alice", 85);
        hashMap.put("Bob", 92);
        hashMap.put("Charlie", 78);
        hashMap.put("Alice", 90);  // Duplicate key - value updated
        
        System.out.println("HashMap: " + hashMap);
        System.out.println("Alice's score: " + hashMap.get("Alice"));
        System.out.println("Contains key 'Bob': " + hashMap.containsKey("Bob"));
        System.out.println("Contains value 78: " + hashMap.containsValue(78));
        
        // Iterating over entries
        System.out.println("\nIterating:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }
        
        // LinkedHashMap - maintains insertion order
        System.out.println("\n=== LinkedHashMap ===");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        
        linkedHashMap.put("USA", "Washington DC");
        linkedHashMap.put("UK", "London");
        linkedHashMap.put("India", "New Delhi");
        
        System.out.println("LinkedHashMap: " + linkedHashMap);
        
        // TreeMap - sorted by keys
        System.out.println("\n=== TreeMap ===");
        Map<Integer, String> treeMap = new TreeMap<>();
        
        treeMap.put(3, "Three");
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(5, "Five");
        treeMap.put(4, "Four");
        
        System.out.println("TreeMap (sorted by key): " + treeMap);
        
        // Removing entry
        treeMap.remove(2);
        System.out.println("After removing key 2: " + treeMap);
    }
}
