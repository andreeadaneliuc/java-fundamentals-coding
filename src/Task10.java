import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un nr pozitiv: ");
        int numar = scanner.nextInt();

        int rezultat = sumOfDigits(numar);
        System.out.println(rezultat);

        System.out.println(calculeazaSumaCifrelor2(numar));
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while(number != 0) {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;

    }

    public static int calculeazaSumaCifrelor2(int number) {
        String numarString = String.valueOf(number);
        char[] digits = numarString.toCharArray();
        int sum = 0;
        for(int i = 0; i < digits.length; i++) {
            sum = sum + digits[i] - '0';
        }
        return sum;
    }
}
