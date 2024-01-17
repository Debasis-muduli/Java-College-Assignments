import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _3_ques {
    public static void main(String[] args) {
        /*String[] namesArray = {"Ram", "John", "Harish", "Anand", "Ajay"};

        System.out.println("Original Array of Names: " + Arrays.toString(namesArray));
        
        Arrays.sort(namesArray);

        System.out.println("Sorted Array of Names: " + Arrays.toString(namesArray));*/
    
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Ram");
        namesList.add("John");
        namesList.add("Harish");
        namesList.add("Anand");
        namesList.add("Ajay");

        System.out.println("Original ArrayList of Names: " + namesList);
        
        Collections.sort(namesList);

        System.out.println("Sorted ArrayList of Names: " + namesList);
    }
}
