public class ReversAString {
    public static void main(String[] args) {
        String days = "monday tuesday wednesday thursday friday saturday sunday";
        String[] daysArray = days.split(" ");
        int len=daysArray.length;

        for(int i=0;i<len;i++){
            String first=daysArray[i].substring(0,1).toUpperCase();
            String remaining=daysArray[i].substring(1);
            daysArray[i]=first+remaining;
        }
        String cap=String.join(" ", daysArray);
        System.out.println(cap);
        for (int i = 0; i < len / 2; i++) {
            String temp = daysArray[i];
            daysArray[i] = daysArray[len - 1 - i];
            daysArray[len - 1 - i] = temp;
        }

        String reversedDays = String.join(" ", daysArray);

        System.out.println(reversedDays);
    }
}
