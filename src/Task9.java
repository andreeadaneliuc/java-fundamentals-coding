import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("length: ");
        int numar = scanner.nextInt();

        desenamWave(numar);
    }

    public static void desenamWave (int length) {
        for (int i = 1; i < length; i++) {
            if (i % 8 == 0 || i % 8 == 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 1; i < length; i++) {
            if (i % 8 == 2 || i % 8 == 7) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

        for (int i = 1; i < length; i++) {
            if (i % 8 == 3 || i % 8 == 6) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
        for (int i = 1; i < length; i++) {
            if (i % 8 == 4 || i % 8 == 5) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
