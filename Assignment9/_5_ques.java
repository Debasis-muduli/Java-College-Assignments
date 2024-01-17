import java.util.*;

public class _5_ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = sc.nextLine();
        StringBuilder s = new StringBuilder(input);
       // System.out.println("String = " + s.toString());
        StringBuilder reverseStr = s.reverse();
        System.out.println("Reverse of "+input+" is " + reverseStr.toString());
    }
}
