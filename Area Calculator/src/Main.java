public class Main {
    public static void main (String[] args) {

        System.out.println(area(2));
        System.out.println(area(2, 2));

    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return 3.14 * (radius * radius);
    }

    public static double area(double base, double height) {
        if (base < 0 || height < 0) {
            return -1.0;
        }
        return base * height;
    }
}
