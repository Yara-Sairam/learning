package src.Oops;

// Class demonstrating encapsulation
public class BankAccount {
    // Private fields to protect account data
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize BankAccount objects
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // Getter for account number (read-only, no setter)
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter and Setter for account holder name
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        if (!accountHolderName.isEmpty()) {
            this.accountHolderName = accountHolderName;
        } else {
            System.out.println("Account holder name cannot be empty!");
        }
    }

    // Getter for balance (read-only, no setter)
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + ". Remaining balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Withdrawal amount must be positive!");
        }
    }
}

// Main class to test BankAccount encapsulation
class Main {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount("12345678", "John Doe", 1000);

        // Access data using getters
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolderName());
        System.out.println("Initial Balance: $" + account.getBalance());

        // Deposit and withdraw money
        account.deposit(500);
        account.withdraw(200);

        // Attempt invalid operations
        account.deposit(-100); // Invalid deposit
        account.withdraw(2000); // Insufficient balance

        // Update account holder name
        account.setAccountHolderName("Jane Doe");
        System.out.println("Updated Account Holder: " + account.getAccountHolderName());
    }
}
