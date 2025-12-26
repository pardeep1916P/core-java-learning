package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Demonstrates Set interface implementations.
 * Sets don't allow duplicate elements.
 */
public class SetDemo {
    public static void main(String[] args) {
        // HashSet - no order guarantee
        System.out.println("=== HashSet ===");
        Set<String> hashSet = new HashSet<>();
        
        hashSet.add("Java");
        hashSet.add("Python");
        hashSet.add("C++");
        hashSet.add("Java");  // Duplicate - will not be added
        
        System.out.println("HashSet: " + hashSet);
        System.out.println("Contains 'Java': " + hashSet.contains("Java"));
        System.out.println("Size: " + hashSet.size());
        
        // LinkedHashSet - maintains insertion order
        System.out.println("\n=== LinkedHashSet ===");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        
        linkedHashSet.add("Red");
        linkedHashSet.add("Green");
        linkedHashSet.add("Blue");
        linkedHashSet.add("Red");  // Duplicate - will not be added
        
        System.out.println("LinkedHashSet: " + linkedHashSet);
        
        // TreeSet - sorted order
        System.out.println("\n=== TreeSet ===");
        Set<Integer> treeSet = new TreeSet<>();
        
        treeSet.add(50);
        treeSet.add(20);
        treeSet.add(80);
        treeSet.add(10);
        treeSet.add(50);  // Duplicate - will not be added
        
        System.out.println("TreeSet (sorted): " + treeSet);
        
        // Removing elements
        treeSet.remove(20);
        System.out.println("After removing 20: " + treeSet);
    }
}
