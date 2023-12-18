//Write a program which will take two integres as input and compute GCD of two numbers
package self;

import java.util.*;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = Gcd(num1, num2);
        System.out.println("GCD of " + num1 + "and" + num2 + " is:" + gcd);
        sc.close();
    }

    static int Gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
