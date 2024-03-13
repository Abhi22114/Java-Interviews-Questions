Payroll system

You are designing a payroll system for a company.

Create a base class Employee with attributes name (String), employeeld (int), and salary (double). Implement a method calculateSalary that returns the salary.

Create a child class Manager that inherits from Employee and adds an attribute bonus (double). Implement a method calculateSalary in the Manager class that overrides the base class method to include the bonus in the salary calculation.

Note: The main class has been provided to you in the editor.

Ex--->>

Sample Test Cases

Test Case 1:

Expected Output:

Enter details for an employee:

Name: John


  import java.util.Scanner;

class Employee {
    String name;
    String designation;
    int yearsOfExperience;
}

class EmployeeInfo extends Employee {
    Scanner scanner = new Scanner(System.in);
    double salaryPerYear;

    public void inputEmployeeDetails() {
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter employee designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter years of experience: ");
        yearsOfExperience = scanner.nextInt();
        System.out.print("Enter salary per year: $");
        salaryPerYear = scanner.nextDouble();
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Years of Experience: " + yearsOfExperience + " years");
    }

    public void calculateSalary() {
        System.out.println("Debugging: Years of experience = " + yearsOfExperience);
        double baseSalary = 20000; // Base salary set to $20,000
        if (yearsOfExperience > 0) {
            double salary = baseSalary + (yearsOfExperience * 1000); // Assuming $1000 raise per year of experience
            System.out.println("Salary: $" + salary);
        } else {
            System.out.println("Invalid years of experience. Salary calculation failed.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeInfo employeeData = new EmployeeInfo();
        employeeData.inputEmployeeDetails();
        employeeData.calculateSalary();
        employeeData.displayEmployeeInfo();
    }
}
Employee ID: 101

Salary: $50000

Enter details for a manager:

Bonus: $ 10000

Employee Details:

Name: John

Employee ID: 101

Bane Salary: $50000.0

Manager Details:

Bonus: 510000.0

Total Salary: $60000.0


