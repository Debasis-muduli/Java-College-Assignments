class Employee {
    String empName;
    int empNo;
    double basicSal;
    double da;
    double hra;
    double grossSal;

    Employee(String empName, int empNo, double basicSal) {
        this.empName = empName;
        this.empNo = empNo;
        this.basicSal = basicSal;
    }

    void calGrossSal() {
        da = 0.20 * basicSal;
        hra = 0.10 * basicSal;
        grossSal = basicSal + da + hra;
    }

    void showEmpDetails() {
        //System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Name", "EMPNO", "BASIC", "DA", "HRA","Gross");
        System.out.printf("%-15s%-15d%-15.2f%-15.2f%-15.2f%-15.2f\n", empName, empNo, basicSal, da, hra, grossSal);
    }

}

public class _2_showEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Saurav", 101, 50000);
        Employee emp2 = new Employee("Bharat", 102, 60000);

        emp1.calGrossSal();
        emp2.calGrossSal();
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s\n", "Name", "EMPNO", "BASIC", "DA", "HRA","Gross");
        emp1.showEmpDetails();
        emp2.showEmpDetails();
    }
}
