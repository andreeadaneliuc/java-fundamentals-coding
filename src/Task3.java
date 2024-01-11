import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("A = ");
        int a = scanner.nextInt();
        System.out.println("B = ");
        int b = scanner.nextInt();
        System.out.println("C = ");
        int c = scanner.nextInt();

        resolveEquation(a, b, c);
    }

    public static void resolveEquation(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (delta < 0) {
            System.out.println("Delta < 0");
            return;
        }
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        System.out.println("x1 = " + x1);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        System.out.println("x2 = " + x2);
    }
}
