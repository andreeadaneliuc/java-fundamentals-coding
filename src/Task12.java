import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scaner.nextLine();

        System.out.println(countsPercentageSpace(text));
    }

    public static double countsPercentageSpace (String text) {
        int nrAparitii = 0;
        for(int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' ') {
                nrAparitii++;
            }
        }
        return (double) (nrAparitii * 100) / text.length();
    }
}
