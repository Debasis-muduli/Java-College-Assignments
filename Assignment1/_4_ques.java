import java.util.Scanner;

public class _4_ques {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m, n, sum = 0;
        System.out.println("Enter 2 Number m and n where m<n ");
        m = in.nextInt();
        n = in.nextInt();

        for (int i = m; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println("Sum of all number is" + sum);
    }

}
