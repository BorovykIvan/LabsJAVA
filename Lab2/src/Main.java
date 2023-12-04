public class Main {
    public static Double firstEquation (double a, double b, double c, double d) {
        double sum = 0;
        double firstPart = Math.pow(a, b) / Math.sinh(Math.abs(b));
        double secondPart = 4 * (Math.log(c) / Math.pow(d, 1/4));
        sum = firstPart + secondPart;

        return sum;
    }

    public static Double secondEquation (double a, double b, double c, double d) {
        double firstPart = 9 * Math.asin(a) / Math.cos(Math.sqrt(Math.abs(b)));
        double secondPart = Math.pow(2.43, d) + Math.log(c);

        return firstPart + secondPart;
    }

    public static Double thirdEquation (double a, double b, double c, double d) {
        double sum = 0;
        double firstPart = 6 * Math.pow(Math.sin(Math.abs(2 * a)), Math.tan(b));
        double secondPart = Math.sqrt(c * Math.cosh(-d));
        sum = firstPart + secondPart;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(firstEquation(1.27, 10.99, 2.73, 25.32));
        System.out.println(secondEquation(0.478, -1.26, 2.68, 18.24));
        System.out.println(thirdEquation(1.478, 9.26, 0.68, 2.24));
    }
}