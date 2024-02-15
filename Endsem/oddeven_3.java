import java.util.*;

public class oddeven_3 implements Runnable {
    int m;
    int n;

    oddeven_3(int m, int n) {
        this.m = m;
        this.n = n;
    }

    @Override
    public void run() {
        for (int i = m; i <= n; i++) {
            if (i % 2 == 1) {
                System.out.println("child:" + i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of m and n:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        oddeven_3 child = new oddeven_3(m, n);
        Thread th = new Thread(child);
        th.start();
        for (int i = m; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println("Parent:" + i);
            }
        }
        sc.close();
    }
}
