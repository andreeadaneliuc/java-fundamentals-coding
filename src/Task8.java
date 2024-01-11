import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

    operatii(10, "/", 0);

    }

    static void operatii(float numar1, String operant, float numar2) {
        switch (operant) {
            case "+":
                System.out.println(numar1 + numar2);
                break;
            case "-":
                System.out.println(numar1 - numar2);
                break;
            case "*":
                System.out.println(numar1 * numar2);
                break;
            case "/":
                if(numar2 == 0) {
                    System.out.println("Cannot calculate");
                    break;
                }
                System.out.println(numar1 / numar2);
                break;
            case "%":
                System.out.println(numar1 % numar2);
                break;
            default:
                System.out.println("Invalid symbol");
        }
    }
}
