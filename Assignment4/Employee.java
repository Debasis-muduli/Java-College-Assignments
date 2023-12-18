import java.util.Scanner;

class empdata {
    private String empName;
    private String empNo;
    private int dependentCnt;

    public empdata(String name, String eno, int depcnt) {
        empName = name;
        empNo = eno;
        dependentCnt = depcnt;
    }

    public void showEmpDetails() {
        System.out.println("empdata Number: " + empNo);
        System.out.println("empdata Name: " + empName);
    }

    public int depCount() {
        return dependentCnt;
    }
}

public class Employee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        empdata[] employees = new empdata[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine(); 
            System.out.println("\nEnter details for empdata " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("empdata Number: ");
            String empNo = scanner.nextLine();
            System.out.print("Number of Dependents: ");
            int depCnt = scanner.nextInt();

            employees[i] = new empdata(name, empNo, depCnt);
        }

        System.out.println("\nDetails of Employees with more than two dependents:");

        for (empdata employee : employees) {
            if (employee.depCount() > 2) {
                employee.showEmpDetails();
                System.out.println("Number of Dependents: " + employee.depCount());
                System.out.println();
            }
        }

        scanner.close();
    }
}
