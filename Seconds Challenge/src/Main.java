import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    }

    public static String timeReciever(int seconds) {
        int minutes = seconds / 60;
        int hours = minutes /60;
        System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
        System.out.println("minutes = " + minutes);
        System.out.println("remaining minutes = " + remainingMinutes);

        int remainingSeconds = seconds % 60;
        System.out.println("remaining seconds = " + remainingSeconds);
        return hours + "h" + remainingMinutes + "m" + remainingSeconds + "s";
    }

    public static String timeReciever(int minutes, int seconds) {
        return "";
    }
}
