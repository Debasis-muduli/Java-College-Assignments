/*Write a Java program to compute the sum of n numbers. Create p number of threads and each thread will add n/p number of elements and update in the shared memory sum. Note updating of shared memory must be synchronized. */

import java.util.Scanner;

public class sum_3 extends Thread {
    static int[] numbers;
    static int sum;
    static int p;
    int start;
    int end;

    public sum_3(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        int localSum = 0;
        for (int i = start; i < end; i++) {
            localSum += numbers[i];
        }
        synchronized (this) {
            sum += localSum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements (n): ");
        int n = sc.nextInt();
        System.out.print("Enter the number of threads (p): ");
        p = sc.nextInt();

        // Create an array of n elements
        numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = i + 1;
        }

        // Create and start p threads
        sum_3[] threads = new sum_3[p];
        for (int i = 0; i < p; i++) {
            // Create a sum_3 for the range of elements for each thread
            threads[i] = new sum_3(i * (n / p), (i + 1) * (n / p));
            // Start the thread
            threads[i].start();
        }

        // Wait for all threads to finish
        try {
            for (int i = 0; i < threads.length; i++) {
                threads[i].join();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Display the final sum
        System.out.println("Sum: " + sum);
    }

}
