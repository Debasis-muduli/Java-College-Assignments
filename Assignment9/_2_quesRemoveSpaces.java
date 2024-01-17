public class _2_quesRemoveSpaces {
    public static void main(String[] args) {
        String inputString = "String            With        Multiple     Spaces";

        String resultString = inputString.replaceAll("\\s+", " ");

        System.out.println("Original String: " + inputString);
        System.out.println("Resultant String: " + resultString);
    }
}
