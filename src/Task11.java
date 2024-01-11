import java.util.Objects;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {

    printTheLongestPhrase();
    }

    public static void printTheLongestPhrase() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder longestWord = new StringBuilder();

        String text;
        do {
            System.out.println("Introduceti textul: ");
            text = scanner.nextLine();
            if(text.length() > longestWord.length() && !text.equalsIgnoreCase("Enough!")) {
                longestWord.setLength(0);
                longestWord.append(text);
            }
        } while (!text.equalsIgnoreCase("Enough!"));
        if(longestWord.isEmpty()) {
            System.out.println("No text provided");
        } else {
            System.out.println(longestWord);
        }


    }


}
