import java.util.Random;
import java.util.Scanner;

public class Task20 {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber =  random.nextInt(100);
        System.out.println(randomNumber);

        tooMuchOrLittle(randomNumber);
    }

    public static void tooMuchOrLittle (int random) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Introdu numarul: ");
            int numarUtilizator = scanner.nextInt();

            if (numarUtilizator > random) {
                System.out.println("Too much");
            } else if (numarUtilizator < random) {
                System.out.println("Not enough");
            } else {
                System.out.println("Congratulations!");
                break;
            }
        }

    }
}
