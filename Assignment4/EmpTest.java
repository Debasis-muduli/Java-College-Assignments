/*Define a class Employee with the following members:
Data members: private String empName
private String empNo
private intdependentCnt
Methods:Employee(String name, String eno, intdepcnt): constructor
void showEmpDetails():displaysempNoandempName
intdepCount(): returns dependentCnt
Write a separate class called EmpTest with a main method thatdefine an array of n
employees where the value of n will be inputted from the user. Read and store the
information of all n employees. Display the details of the employees with more than two
dependents.*/

import java.util.Scanner;

class Employee {
    private String empName;
    private String empNo;
    private int dependentCnt;

    public Employee(String name, String eno, int depcnt) {
        empName = name;
        empNo = eno;
        dependentCnt = depcnt;
    }

    public void showEmpDetails() {
        System.out.println("Employee Number: " + empNo);
        System.out.println("Employee Name: " + empName);
    }

    public int depCount() {
        return dependentCnt;
    }
}

public class EmpTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Employee Number: ");
            String empNo = sc.nextLine();
            System.out.print("Number of Dependents: ");
            int depCnt = sc.nextInt();

            employees[i] = new Employee(name, empNo, depCnt);
        }

        System.out.println("\nDetails of Employees with more than two dependents:");

        for (Employee employee : employees) {
            if (employee.depCount() > 2) {
                employee.showEmpDetails();
                System.out.println("Number of Dependents: " + employee.depCount());
                System.out.println();
            }
        }

        sc.close();
    }
}
