import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul primit = ");
        int numar = scanner.nextInt();

        fizzBuzz(numar);
    }

    public static void fizzBuzz (int numar) {
        for(int i = 1; i <= numar; i++) {
            if(i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
