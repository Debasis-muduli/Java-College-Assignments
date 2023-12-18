/*Define a class Employee having basic data members empName, empID and empSal,with necessary member functions and constructors. Define a class Manager which is inherited from Employee class and having a data member bonus. Define the driver classthat create object of the class Manager and access Manager details. */
class Employee {
    String empName;
    int empID;
    double empSal;

    Employee(String empName, int empID, double empSal) {
        this.empName = empName;
        this.empID = empID;
        this.empSal = empSal;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + empID);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Salary: " + empSal);
    }
}

class Manager extends Employee{
    double bonus;

    Manager(String empName, int empID, double empSal, double bonus) {

        super(empName, empID, empSal);
        this.bonus = bonus;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: " + bonus);
    }
}

public class ManagerDriver {
    public static void main(String[] args) {
        Manager manager = new Manager("DEBASIS", 101, 50000.0, 10000.0);

        System.out.println("Manager Details:");
        manager.displayDetails();
    }
}
