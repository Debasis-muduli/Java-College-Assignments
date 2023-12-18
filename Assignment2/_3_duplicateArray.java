import java.util.Scanner;

public class _3_duplicateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements you want to enter");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Given Array");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + "\t");
        }

        int uniqueArray[] = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (a[i] == uniqueArray[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                uniqueArray[uniqueCount] = a[i];
                uniqueCount++;
            }
        }

        System.out.println("\nModified Array");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(uniqueArray[i] + "\t");
        }
        sc.close();
    }
}
