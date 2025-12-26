package oop;

/**
 * Demonstrates encapsulation - bundling data and methods that operate on that data.
 * Uses access modifiers (private) and getter/setter methods.
 */
class BankAccount {
    // Private instance variables (data hiding)
    private String accountNumber;
    private double balance;
    
    // Constructor
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    
    // Getter methods (public interface to access private data)
    public String getAccountNumber() {
        return accountNumber;
    }
    
    public double getBalance() {
        return balance;
    }
    
    // Setter method with validation
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Invalid or insufficient funds");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("ACC123456", 1000.0);
        
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: $" + account.getBalance());
        
        account.deposit(500.0);
        System.out.println("Balance after deposit: $" + account.getBalance());
        
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: $" + account.getBalance());
        
        account.withdraw(2000.0);  // This should fail
    }
}
