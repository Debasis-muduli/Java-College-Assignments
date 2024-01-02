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


