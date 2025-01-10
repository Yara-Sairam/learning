package JUnits;


import src.Oops.Employee;

// Test class to validate encapsulation
public class EmployeeTest {
    public static void main(String[] args) {
        // Test case 1: Create an Employee object with valid details
        Employee emp1 = new Employee(101, "Alice", 5000);
        System.out.println("Test Case 1: Display Employee Details");
        emp1.displayEmployeeInfo();

        // Test case 2: Update name and salary using setters
        emp1.setName("Alice Johnson");
        emp1.setSalary(5500);
        System.out.println("\nTest Case 2: Updated Employee Details");
        emp1.displayEmployeeInfo();

        // Test case 3: Attempt invalid updates
        System.out.println("\nTest Case 3: Attempt Invalid Updates");
        emp1.setId(-1); // Invalid ID
        emp1.setSalary(-1000); // Invalid salary
        emp1.displayEmployeeInfo();

        // Test case 4: Create an Employee object with invalid initial values
        System.out.println("\nTest Case 4: Create Employee with Invalid Initial Values");
        Employee emp2 = new Employee(-5, "Bob", -2000);
        emp2.displayEmployeeInfo();
    }
}
