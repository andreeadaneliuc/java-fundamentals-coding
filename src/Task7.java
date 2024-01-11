import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu nr: ");
        number = scanner.nextInt();

        printTillIndex(number);
    }

    public static void printTillIndex(int index) {
        int a, b, c;
        a = 1;
        b = 1;
        index--;
        if (index > 1) {
            index--;
        }
        while (index > 0) {
            c = a + b;
            a = b;
            b = c;
            index--;
        }
        System.out.print(b);
    }
}
