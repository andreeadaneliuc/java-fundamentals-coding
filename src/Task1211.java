import java.util.Scanner;

public class Task1211 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scanner.nextLine();

        countsSpace(text);
        countsSpace2(text);
        countsSpace3(text);
    }

    public static void countsSpace (String text) {
        int nrAparitii = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                nrAparitii++;
            }
        }
        System.out.println((nrAparitii * 100) / text.length() + "%");
    }

    public static void countsSpace2 (String text) {
        String text2 = text.replaceAll(" ", "");
        int nrAparitii = text.length() - text2.length();
        System.out.println((nrAparitii * 100) / text.length() + "%");
    }

    public static void countsSpace3 (String text) {
        char[] caractere = text.toCharArray();
        int nrAparitii = 0;
        for(int i = 0; i < caractere.length; i++) {
            if(caractere[i] == ' ') {
                nrAparitii++;
            }
        }
        System.out.println((nrAparitii * 100) / caractere.length + "%");
    }

}
