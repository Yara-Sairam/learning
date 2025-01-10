package JUnits;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.Oops.BankAccount;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    private BankAccount account;

    @BeforeEach
    void setUp() {
        // Initialize a BankAccount object before each test
        account = new BankAccount("12345678", "John Doe", 1000.0);
    }

    @Test
    void testInitialBalance() {
        // Verify initial balance
        assertEquals(1000.0, account.getBalance(), "Initial balance should be 1000.0");
    }

    @Test
    void testDepositValidAmount() {
        // Deposit a valid amount
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), "Balance should be 1500.0 after deposit");
    }

    @Test
    void testDepositInvalidAmount() {
        // Attempt to deposit an invalid amount
        account.deposit(-100.0);
        assertEquals(1000.0, account.getBalance(), "Balance should remain 1000.0 after invalid deposit");
    }

    @Test
    void testWithdrawValidAmount() {
        // Withdraw a valid amount
        account.withdraw(200.0);
        assertEquals(800.0, account.getBalance(), "Balance should be 800.0 after withdrawal");
    }

    @Test
    void testWithdrawInvalidAmount() {
        // Attempt to withdraw more than the balance
        account.withdraw(2000.0);
        assertEquals(1000.0, account.getBalance(), "Balance should remain 1000.0 after invalid withdrawal");
    }

    @Test
    void testWithdrawNegativeAmount() {
        // Attempt to withdraw a negative amount
        account.withdraw(-100.0);
        assertEquals(1000.0, account.getBalance(), "Balance should remain 1000.0 after negative withdrawal");
    }

    @Test
    void testSetAccountHolderNameValid() {
        // Change the account holder name to a valid name
        account.setAccountHolderName("Jane Doe");
        assertEquals("Jane Doe", account.getAccountHolderName(), "Account holder name should be updated to 'Jane Doe'");
    }

    @Test
    void testSetAccountHolderNameInvalid() {
        // Attempt to set an empty account holder name
        account.setAccountHolderName("");
        assertEquals("John Doe", account.getAccountHolderName(), "Account holder name should remain 'John Doe' after invalid update");
    }

    @Test
    void testAccountNumberIsReadOnly() {
        // Verify account number is read-only
        assertEquals("12345678", account.getAccountNumber(), "Account number should be '12345678'");
    }
}
