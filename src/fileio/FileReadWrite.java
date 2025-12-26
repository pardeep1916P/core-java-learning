package fileio;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * Demonstrates reading from and writing to text files.
 * Uses FileWriter, FileReader, BufferedWriter, and BufferedReader.
 */
public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.txt";
        
        // Writing to a file
        System.out.println("=== Writing to File ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write("Hello, World!");
            writer.newLine();
            writer.write("This is a sample text file.");
            writer.newLine();
            writer.write("Java File I/O demonstration.");
            System.out.println("Data written to " + fileName);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
        
        // Reading from a file
        System.out.println("\n=== Reading from File ===");
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
