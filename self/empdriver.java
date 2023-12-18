
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String designation;
    double grossSalary;

    Employee() {
    }

    Employee(int empId, String empName, String designation, double grossSalary) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
        this.grossSalary = grossSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("----------------------");
    }
}

public class empdriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[50];

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String empName = sc.nextLine();
            System.out.print("Designation: ");
            String designation = sc.nextLine();
            System.out.print("Gross Salary: ");
            double grossSalary = sc.nextDouble();

            employees[i] = new Employee(empId, empName, designation, grossSalary);
        }

        System.out.println("\nDetails of all employees:");
        for (int i = 0; i < employees.length; i++) {
            employees[i].displayDetails();
        }
        sc.close();
    }
}
