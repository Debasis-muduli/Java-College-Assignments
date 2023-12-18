import java.util.Scanner;

public class scanner {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        // System.out.print("Enter an integer: ");
        // int a = in.nextInt();
        // System.out.println("You entered: " + a);
        System.out.print("Enter an decimal: ");
        float b = in.nextFloat();
        System.out.println("You entered: " + b);

        double a=16.4;
        float x=(float)a;
        System.out.println(x);
        in.close(); 
    }
}