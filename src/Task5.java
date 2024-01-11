import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        number = scanner.nextInt();

        printamNumerelePrime(number);
    }

    private static boolean isPrime(int number) {
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if (number == 1) {
                return false;
            } if(number % i == 0) {
                return false;
            }
        } return true;
    }

    private static void printamNumerelePrime(int number) {
        for( int i = 1; i < number; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
