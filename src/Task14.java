import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {

        char firstLetter, secondLetter;
        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduceti cele 2 litere: ");
        firstLetter = scaner.next().charAt(0);
        secondLetter = scaner.next().charAt(0);
        System.out.println(diferentaDintre2litere(firstLetter, secondLetter));
        System.out.println(diferentaDintre2Litere2(firstLetter, secondLetter));

    }

    public static int diferentaDintre2litere(char first, char second) {
        if(first == second ) {
            return 0;
        }
        int differenta = first - second;

        if (differenta < 0) {
            differenta = differenta * -1;
        }
        return differenta -1;
    }

    public static int diferentaDintre2Litere2(char first, char second) {
        return first - second < 0 ? second - first -1: first - second -1;
    }
}
