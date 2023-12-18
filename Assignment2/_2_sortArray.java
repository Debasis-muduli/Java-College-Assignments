import java.util.*;

public class _2_sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of element you want ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int low = a[i];
            for (int j = i+1; j < n; j++) {
                if (a[j] < low) {
                    int temp = a[j];
                    a[j] = low;
                    low = temp;
                }
            }
            if (a[i] != low) {
                int temp = a[i];
                a[i] = low;
                low = temp;
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }
        sc.close();
    }
}
