
import java.util.*;

public class _1_searchArray {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 elements");
        for (int i = 0; i < 10; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int n = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if (a[i] == n) {
                System.out.println("Element found at position " + i+1);
            }
        }
        sc.close();
    }

}
