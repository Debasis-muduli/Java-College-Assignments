/*Define a class called Account with the following properties and methods:
Properties: String name, int accNumber, double accBalance
Methods: void deposit(int amt) and double withdraw(int amt)
Assume that an account needs to have a minimum balance of 500. If an attempt is made to withdraw, which results in balance going below 500, throw a user defined exception called MinimumBalanceException. Use throw and throws wherever necessary. 
 */
class Account_3 {
    String name;
    int accNumber;
    double accBalance;
    static final double minimunbal = 500.0;

    public Account_3(String name, int accNumber, double accBalance) {
        this.name = name;
        this.accNumber = accNumber;
        this.accBalance = accBalance;
    }

    public void deposit(int amt) {
        accBalance += amt;
        System.out.println("Amount deposited successfully. Current balance: " + accBalance);
    }

    public double withdraw(int amt) throws MinimumBalanceException {
        if (accBalance - amt < minimunbal) {
            throw new MinimumBalanceException("Withdrawal failed. Minimum balance limit reached.");
        }
        accBalance -= amt;
        System.out.println("Amount withdrawn successfully. Current balance: " + accBalance);
        return amt;
    }

    public static void main(String[] args) {
        Account_3 acc = new Account_3("John Doe", 123456, 1000.0);
        try {
            acc.withdraw(600); // withdrawing an amount that will result in balance < 500
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

class MinimumBalanceException extends Exception {
    public MinimumBalanceException(String message) {
        super(message);
    }
}
