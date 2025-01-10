package src.Oops;

// Main class to test encapsulation
public class Section {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "Alice", 5000);

        // Access the object using public methods
        emp.displayEmployeeInfo();

        // Modify employee details using setters
        emp.setName("Alice Johnson");
        emp.setSalary(5500);

        System.out.println("\nUpdated Employee Details:");
        emp.displayEmployeeInfo();

        // Attempt invalid updates
        emp.setId(-1); // Invalid ID
        emp.setSalary(-1000); // Invalid salary
    }
}
