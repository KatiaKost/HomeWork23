public class Time {
    public static void printTime() {
        int hour = 0;
        int minute = 0;
        int second = 0;

        do {
            System.out.println(hour + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second));
            second++;

            while (second > 59) {
                second = 0;
                minute++;
            }

            while (minute > 59) {
                minute = 0;
                hour++;
            }

            if (hour > 1 && minute % 10 == 0) {
                break;
            }
        } while (!(hour > 1 && minute % 10 == 0) && !(second * hour > minute) && hour <= 6);
    }

    public static void main(String[] args) {
        printTime();
    }
}