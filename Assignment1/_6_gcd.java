import java.util.Scanner;

public class _6_gcd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int gcdResult = calculateGCD(num1, num2);

        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcdResult);

        scanner.close();
    }

    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
