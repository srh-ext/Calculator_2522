import java.util.Scanner;

public class Main {
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    public static double multi(double num1, double num2) {
        return num1 * num2;
    }

    public static double div(double num1, double num2) {
        return num1 / num2;
    }
    /*
    public static double div(double num1, double num2) {
        return num1 / num2;
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        System.out.println(num1);


        double sum = add(num1, num2);
        double sub = sub(num1, num2);
        double multi = multi(num1, num2);
        double div = div(num1, num2);

        System.out.println("sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("multi: " + multi);
        System.out.println("div: " + div);
    }
}