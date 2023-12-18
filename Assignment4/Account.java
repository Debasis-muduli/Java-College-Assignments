import java.util.Scanner;

class Accountdata {
    private String accNo;
    private float balance;
    private int timePeriod;
    private static float intInYears = 7.5f;

    public Accountdata(String accNo, float balance, int timePeriod) {
        this.accNo = accNo;
        this.balance = balance;
        this.timePeriod = timePeriod;
    }

    public float calculateInterest() {
        return (balance * intInYears * timePeriod) / 100;
    }

    public void showAccDetails() {
        System.out.println("Accountdata Number: " + accNo);
        System.out.println("Balance: $" + balance);
        System.out.println("Interest Amount: $" + calculateInterest());
    }

    public static void changeIntRate(float newRate) {
        intInYears = newRate;
        System.out.println("\nInterest rate changed to " + newRate + "%");
    }
}

public class Account {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of accounts: ");
        int n = scanner.nextInt();

        Accountdata[] accounts = new Accountdata[n];

        for (int i = 0; i < n; i++) {
            scanner.nextLine(); 
            System.out.println("\nEnter details for Accountdata " + (i + 1) + ":");
            System.out.print("Accountdata Number: ");
            String accNo = scanner.nextLine();
            System.out.print("Balance: $");
            float balance = scanner.nextFloat();
            System.out.print("Time Period (in years): ");
            int timePeriod = scanner.nextInt();

            accounts[i] = new Accountdata(accNo, balance, timePeriod);
        }

        System.out.println("\nAccount Details Before Interest Rate Change:");
        for (Accountdata account : accounts) {
            account.showAccDetails();
            System.out.println();
        }

        Accountdata.changeIntRate(8.0f);

        System.out.println("\nAccount Details After Interest Rate Change:");
        for (Accountdata account : accounts) {
            account.showAccDetails();
            System.out.println();
        }

        scanner.close();
    }
}
