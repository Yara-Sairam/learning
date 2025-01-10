package src.Oops;


// A class demonstrating encapsulation
public class Employee {
    // Private variables - these cannot be accessed directly outside the class
    private int id;
    private String name;
    private double salary;

    // Constructor to initialize Employee objects
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Public getter for id
    public int getId() {
        return id;
    }

    // Public setter for id
    public void setId(int id) {
        if (id > 0) { // Validation logic
            this.id = id;
        } else {
            System.out.println("Invalid ID!");
        }
    }

    // Public getter for name
    public String getName() {
        return name;
    }

    // Public setter for name
    public void setName(String name) {
        if (!name.isEmpty()) { // Validation logic
            this.name = name;
        } else {
            System.out.println("Name cannot be empty!");
        }
    }

    // Public getter for salary
    public double getSalary() {
        return salary;
    }

    // Public setter for salary
    public void setSalary(double salary) {
        if (salary > 0) { // Validation logic
            this.salary = salary;
        } else {
            System.out.println("Salary must be positive!");
        }
    }

    // Method to display employee details
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

