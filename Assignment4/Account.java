/*Create a class Account having data members accNo, balance, timePeriod and intInYears(as
static and initialize with 7.5%). The class should also contain the following methods:
 floatcalculateInterst() which calculates and returns the interest amount.
 voidshowAccDetails() which displays account number, balance and calculated
interest amount.
 staticvoidchangeIntRate(float newRate) which changes the interest rate to newRate.
Create an array of object of the class Test. Store the details of each object through the
parameterized constructor. Display all the account details by calling the method
showAccDetails().Change the interest rate to a new one by calling the method
changeIntRate(). Finally display the account details after the change in interest rate. */
import java.util.Scanner;

class Account {
    String accNo;
    float balance;
    int timePeriod;
    static float intInYears = 7.5f;

    public Account(String accNo, float balance, int timePeriod) {
        this.accNo = accNo;
        this.balance = balance;
        this.timePeriod = timePeriod;
    }

    public float calculateInterest() {
        return (balance * intInYears * timePeriod) / 100;
    }

    public void showAccDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Amount: " + calculateInterest());
    }

    public static void changeIntRate(float newRate) {
        intInYears = newRate;
        System.out.println("\nInterest rate changed to " + newRate + "%");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of accounts: ");
        int n = sc.nextInt();

        Account[] accounts = new Account[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine(); 
            System.out.println("\nEnter details for Account " + (i + 1) + ":");
            System.out.print("Account Number: ");
            String accNo = sc.nextLine();
            System.out.print("Balance: ");
            float balance = sc.nextFloat();
            System.out.print("Time Period (in years): ");
            int timePeriod = sc.nextInt();

            accounts[i] = new Account(accNo, balance, timePeriod);
        }

        System.out.println("\nAccount Details Before Interest Rate Change:");
        for (Account account : accounts) {
            account.showAccDetails();
            System.out.println();
        }

        Account.changeIntRate(8.0f);

        System.out.println("\nAccount Details After Interest Rate Change:");
        for (Account account : accounts) {
            account.showAccDetails();
            System.out.println();
        }

        sc.close();
    }
}
