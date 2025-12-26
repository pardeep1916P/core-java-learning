package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Demonstrates List interface implementations: ArrayList and LinkedList.
 * Lists maintain insertion order and allow duplicate elements.
 */
public class ListDemo {
    public static void main(String[] args) {
        // ArrayList - backed by dynamic array
        System.out.println("=== ArrayList ===");
        List<String> arrayList = new ArrayList<>();
        
        // Adding elements
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Apple");  // Duplicates allowed
        
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Size: " + arrayList.size());
        System.out.println("Element at index 1: " + arrayList.get(1));
        
        // Removing element
        arrayList.remove("Banana");
        System.out.println("After removing Banana: " + arrayList);
        
        // Iterating
        System.out.println("Iterating:");
        for (String fruit : arrayList) {
            System.out.println("  " + fruit);
        }
        
        // LinkedList - backed by doubly-linked list
        System.out.println("\n=== LinkedList ===");
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);   // Add at beginning
        linkedList.addLast(40);   // Add at end
        
        System.out.println("LinkedList: " + linkedList);
        System.out.println("First element: " + linkedList.getFirst());
        System.out.println("Last element: " + linkedList.getLast());
        
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("After removing first and last: " + linkedList);
    }
}
