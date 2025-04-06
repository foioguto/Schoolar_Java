import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("feet: ");
        int user_feet = input.nextInt();

        System.out.println("inches: ");
        int user_inches = input.nextInt();

        System.out.println("Your height in centimeters is:" + convertToCentimeters(user_feet, user_inches));

    }
    // 1 inch = 2.54 cm
    // 1 foot = 12 inches

    public static double convertToCentimeters(int finalHeight) {
        // convert to centimeters
        return finalHeight * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        // convert to inches
        int finalHeight = feet * 12 + inches;
        return convertToCentimeters(finalHeight);
    }
}
