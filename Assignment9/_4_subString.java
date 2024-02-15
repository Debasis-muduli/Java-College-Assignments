import java.util.Scanner;

public class _4_subString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to find its sub-strings: ");
        String inputString = scanner.nextLine();

        System.out.println("Sub-strings of the string \"" + inputString + "\" are:");

        findAllSubstrings(inputString);

        scanner.close();

    }

    static void findAllSubstrings(String str) {
        int length = str.length();

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j <= length; j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
}
