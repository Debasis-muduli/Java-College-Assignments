class Time {
    int hour;
    int minute;
    int second;

    Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    void displayTime() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, second);
    }

    Time addTime(Time otherTime) {
        Time sumTime = new Time(0, 0, 0);

        sumTime.second = this.second + otherTime.second;
        if (sumTime.second >= 60) {
            sumTime.second -= 60;
            sumTime.minute++;
        }

        sumTime.minute += this.minute + otherTime.minute;
        if (sumTime.minute >= 60) {
            sumTime.minute -= 60;
            sumTime.hour++;
        }

        sumTime.hour += this.hour + otherTime.hour;

        return sumTime;
    }

}

public class timeTest {
    public static void main(String[] args) {
        Time time1 = new Time(10, 30, 45);
        Time time2 = new Time(4, 20, 15);

        System.out.println("Time 1:");
        time1.displayTime();

        System.out.println("\nTime 2:");
        time2.displayTime();

        Time sumTime = time1.addTime(time2);
        System.out.println("\nSum of Time 1 and Time 2:");
        sumTime.displayTime();
    }
}
