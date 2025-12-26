package multithreading;

/**
 * Demonstrates creating and running threads in Java.
 * Shows two approaches: extending Thread class and implementing Runnable interface.
 */
// Approach 1: Extending Thread class
class MyThread extends Thread {
    private String threadName;
    
    MyThread(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);  // Sleep for 500 milliseconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished");
    }
}

// Approach 2: Implementing Runnable interface
class MyRunnable implements Runnable {
    private String threadName;
    
    MyRunnable(String name) {
        this.threadName = name;
    }
    
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted");
            }
        }
        System.out.println(threadName + " finished");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main thread started");
        
        // Creating threads using Thread class
        MyThread thread1 = new MyThread("Thread-1");
        MyThread thread2 = new MyThread("Thread-2");
        
        // Creating threads using Runnable interface
        Thread thread3 = new Thread(new MyRunnable("Thread-3"));
        
        // Starting threads
        thread1.start();
        thread2.start();
        thread3.start();
        
        // Wait for all threads to complete
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        
        System.out.println("Main thread finished");
    }
}
