package fileio;

import java.io.File;
import java.io.IOException;

/**
 * Demonstrates file operations using the File class.
 * Creating, checking, and deleting files and directories.
 */
public class FileOperations {
    public static void main(String[] args) {
        // Creating a file object
        File file = new File("testfile.txt");
        
        System.out.println("=== File Operations ===");
        
        // Creating a new file
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("Error creating file: " + e.getMessage());
        }
        
        // Getting file information
        if (file.exists()) {
            System.out.println("\nFile Information:");
            System.out.println("Name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File size (bytes): " + file.length());
        }
        
        // Deleting a file
        if (file.delete()) {
            System.out.println("\nFile deleted: " + file.getName());
        } else {
            System.out.println("\nFailed to delete file.");
        }
        
        // Directory operations
        System.out.println("\n=== Directory Operations ===");
        File directory = new File("testdir");
        
        if (directory.mkdir()) {
            System.out.println("Directory created: " + directory.getName());
        } else {
            System.out.println("Directory already exists or failed to create.");
        }
        
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Is directory: true");
        }
        
        if (directory.delete()) {
            System.out.println("Directory deleted: " + directory.getName());
        }
    }
}
