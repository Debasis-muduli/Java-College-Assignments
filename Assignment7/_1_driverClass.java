import mypack.Display;

public class _1_driverClass {
    public static void main(String[] args) {

        Display intDisplay = new Display(42);

        Display floatDisplay = new Display(3.14f);

        int[] intArray = { 1, 2, 3, 4, 5 };
        Display intArrayDisplay = new Display(intArray);

        Display stringDisplay = new Display("Hello, World!");

        String[] stringArray = { "Java", "is", "awesome" };
        Display stringArrayDisplay = new Display(stringArray);
    }
}
