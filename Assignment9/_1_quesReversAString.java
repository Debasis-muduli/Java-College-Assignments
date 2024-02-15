public class _1_quesReversAString {
    public static void main(String[] args) {
        String days = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String[] daysArray = days.split(" ");
        int len=daysArray.length;
        for (int i = 0; i < len / 2; i++) {
            String temp = daysArray[i];
            daysArray[i] = daysArray[len - 1 - i];
            daysArray[len - 1 - i] = temp;
        }

        String reversedDays = String.join(" ", daysArray);

        System.out.println(reversedDays);
    }
}
