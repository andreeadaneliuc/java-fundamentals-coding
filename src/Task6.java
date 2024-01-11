import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numarul primit = ");
        int numar = scanner.nextInt();

        double v = sumHarmonic(numar);
        System.out.println("suma harmonica este: " + v);
    }

    public static double sumHarmonic(int numar) {
        if (numar <= 0) {
            return 0;
        }

        double sum = 0;
        for(int i = 1; i <= numar; i++) {
            sum += (double) 1/i;
        }
        return sum;
    }
}
