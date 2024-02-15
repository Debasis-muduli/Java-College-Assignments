/*Create a Package mypack which contains one class Display where constructor will print 
the the data which it will be received. The data may be int, float, int[], String, String[]. 
Design a driver class outside the package where Display class of mypack will be imported. 
When object of Display class will be created it will call respective constructor. Demonstrate 
all the constructors in driver class. */
package mypack;

public class Display {
    public Display(int data) {
        System.out.println("Received int data: " + data);
    }

    public Display(float data) {
        System.out.println("Received float data: " + data);
    }

    public Display(int[] data) {
        System.out.print("Received int array data: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public Display(String data) {
        System.out.println("Received String data: " + data);
    }

    public Display(String[] data) {
        System.out.print("Received String array data: ");
        for (String str : data) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}


