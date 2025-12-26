package multithreading;

/**
 * Demonstrates thread synchronization to prevent race conditions.
 * Shows synchronized methods and blocks.
 */
class Counter {
    private int count = 0;
    
    // Synchronized method
    public synchronized void increment() {
        count++;
    }
    
    public int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;
    private String threadName;
    
    CounterThread(Counter counter, String name) {
        this.counter = counter;
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
        System.out.println(threadName + " finished incrementing");
    }
}

public class Synchronization {
    public static void main(String[] args) {
        System.out.println("=== Without Proper Synchronization ===");
        System.out.println("(With synchronized method, race condition is prevented)");
        
        Counter counter = new Counter();
        
        // Create multiple threads that increment the same counter
        CounterThread t1 = new CounterThread(counter, "Thread-1");
        CounterThread t2 = new CounterThread(counter, "Thread-2");
        CounterThread t3 = new CounterThread(counter, "Thread-3");
        
        t1.start();
        t2.start();
        t3.start();
        
        // Wait for all threads to complete
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Final count: " + counter.getCount());
        System.out.println("Expected count: 3000");
        System.out.println("(Should match because of synchronization)");
    }
}
