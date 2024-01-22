/*Write a Java program to create an ArrayList. The program should able to replace a specified
element with a new value.  */

import java.util.ArrayList;
import java.util.Scanner;

public class _1_ques {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add("Grapes");
        list.add("Mango");

        System.out.println("Original ArrayList: " + list);

        replaceElement(list);

        System.out.println("Modified ArrayList: " + list);
    }

    private static void replaceElement(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the element to replace: ");
        String oldElement = sc.nextLine();

        if (list.contains(oldElement)) {
            System.out.print("Enter the new value: ");
            String newElement = sc.nextLine();

            int index = list.indexOf(oldElement);
            list.set(index, newElement);

            System.out.println("Element replaced successfully!");
        } else {
            System.out.println("Element not found in the ArrayList.");
        }

        sc.close();
    }
}
