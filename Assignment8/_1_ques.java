import java.util.*;

public class _1_ques implements Runnable {
    int m;
    int n;

    _1_ques(int m, int n) {
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
        _1_ques child = new _1_ques(m, n);
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
