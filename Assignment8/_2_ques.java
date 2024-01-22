class SquareThread extends Thread {
    int number;

    SquareThread(int number) {
        this.number = number;
    }

@Override
    public void run() {
        int square = number * number;
        System.out.println("Thread 1: Square of " + number + " is " + square);
//  try {
        //     Thread.sleep(1000);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }
    }
}

class DigitSumThread extends Thread {
    int square;

    DigitSumThread(int square) {
        this.square = square;
    }

@Override
    public void run() {
         try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int digitSum = calculateDigitSum(square);
        System.out.println("Thread 2: Sum of digits of the square is " + digitSum);
    }

    int calculateDigitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}

public class _2_ques {
    public static void main(String[] args) {
        int inputNumber = 123;

        new SquareThread(inputNumber).start();

        new DigitSumThread(inputNumber * inputNumber).start();

    }
}
