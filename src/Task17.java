import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dataSda = scanner.nextLine();
        System.out.println(Period.between(LocalDate.parse(dataSda),LocalDate.now()));
        ChronoUnit.DAYS.between(LocalDate.parse(dataSda),LocalDate.now());
        String name;
    }
}
