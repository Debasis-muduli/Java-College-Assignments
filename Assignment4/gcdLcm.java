/*Write a program that will take two integer numbers from the command prompt and find
their GCD and LCM. If the user does not provide exactly two numbers of arguments then
the program should display error */
public class gcdLcm {
    public static void main(String[] args) {
       
        if (args.length != 2 || !isInteger(args[0]) || !isInteger(args[1])) {
            System.out.println("Error: Please provide exactly two valid integer numbers as arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int gcd = GCD(num1, num2);
        int lcm = LCM(num1, num2);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }

    static boolean isInteger(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    static int LCM(int a, int b) {
        return (a * b) / GCD(a, b);
    }
}
