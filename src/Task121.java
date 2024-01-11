import java.util.Scanner;

public class Task121 {
    public static void main(String[] args) {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        String text = scaner.nextLine();

        System.out.println(calculProcentLitera(text, 'A'));
    }
    public static int calculProcentLitera(String text, Character symbol) {
        int nrAparitii = 0;
        text = text.toLowerCase();
        symbol = symbol.toString().toLowerCase().charAt(0);

        for( int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == symbol) {
                nrAparitii++;
            }
        }
        return nrAparitii;
    }
}
