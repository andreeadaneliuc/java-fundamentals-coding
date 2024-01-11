import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scaner.nextLine();

//        stutters(text);
        stutters2(text);
    }

    public static void stutters(String text) {
        String[] textArray = text.split(" ");
        for (int i = 0; i < textArray.length; i++) {
            System.out.print(textArray[i] + " " + textArray[i] + " ");
        }
    }

    public static void stutters2(String text) {
        StringBuilder cuvant = new StringBuilder();
        for(int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                System.out.print(cuvant + " " + cuvant + " ");
                cuvant = new StringBuilder();
            } else {
                cuvant.append(text.charAt(i));
            }
        }
        System.out.print(cuvant + " " + cuvant + " ");
    }
}
