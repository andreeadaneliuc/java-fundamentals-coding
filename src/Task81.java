import java.util.Scanner;

public class Task81 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul 1: ");
        double numar1 = scanner.nextInt();
        System.out.println("Operand: ");
        char operand  = scanner.next().charAt(0);
        System.out.println("Numarul 2: ");
        double numarul2 = scanner.nextInt();

        operatii(numar1, operand, numarul2);
    }

    static void operatii(double numar1, char operand, double numar2) {
//        if(operand == '/' && numar2 == 0) {
//            System.out.println("Cannot calculate");
//            return;
//        }

        switch (operand) {
            case '/':
                if(numar2 == 0) {
                    System.out.println("Cannot calculate");
                    break;
                }
                System.out.println(numar1 / numar2);
                break;
            case '+':
                System.out.println(numar1 + numar2);
                break;
            case '-':
                System.out.println(numar1 - numar2);
                break;
            case '*':
                System.out.println(numar1 * numar2);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }

}
