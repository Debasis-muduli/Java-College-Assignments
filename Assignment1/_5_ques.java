public class _5_ques {
    public static void main(String[] args) {
        int count = 0;

        for (int num = 37; num <= 129; num++) {
            if (isPrime(num)) {
                count++;
            }
        }

        System.out.println("The number of prime numbers between 37 and 129 is: " + count);
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
