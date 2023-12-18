import java.util.Scanner;

public class _8_numberToWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 9: ");
        int number = scanner.nextInt();

        printBottlesOnWall(number);

        scanner.close();
    }

    static void printBottlesOnWall(int num) {
        if (num < 0 || num > 9) {
            System.out.println("Please enter a number between 0 and 9.");
            return;
        }

        String wordVersion = convertToWords(num);
        String pluralSuffix = (num == 1) ? "" : "s";

        System.out.println(wordVersion+ " bottle" + pluralSuffix + " standing on the wall");
    }

    static String convertToWords(int num) {
        switch (num) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "Invalid";
        }
    }
}
