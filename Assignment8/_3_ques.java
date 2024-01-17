/*Write  a  java  program  that  will  compute  product  of  two  vector  (1D  array)  using 
multithreading.  The  program  should  read  two  vectors  (of  same  size)  from  the  user.  First thread  should  multiply  the  corresponding  elements  present  in  the  odd  index  position  and second thread should multiply the corresponding elements present in the even index position. 
Main thread should display the result.  */

import java.util.Scanner;

class multiply extends Thread {
    private int[] vector1;
    private int[] vector2;
    private int[] result;
    private int startIndex;
    private int endIndex;

    public multiply(int[] vector1, int[] vector2, int[] result, int startIndex, int endIndex) {
        this.vector1 = vector1;
        this.vector2 = vector2;
        this.result = result;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run() {
        for (int i = startIndex; i <= endIndex; i += 2) {
            result[i] = vector1[i] * vector2[i];
        }
    }
}

public class _3_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the vectors: ");
        int size = sc.nextInt();

        int[] vector1 = new int[size];
        int[] vector2 = new int[size];
        int[] result = new int[size];

        System.out.println("Enter elements for the first vector:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            vector1[i] = sc.nextInt();
        }

        System.out.println("Enter elements for the second vector:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + i + ": ");
            vector2[i] = sc.nextInt();
        }

        multiply oddThread = new multiply(vector1, vector2, result, 1, size - 1);
        multiply evenThread = new multiply(vector1, vector2, result, 0, size - 1);

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nResult of Vector Multiplication:");
        for (int i = 0; i < size; i++) {
            System.out.print(result[i] + " ");
        }

        sc.close();
    }
}
