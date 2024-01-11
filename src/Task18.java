import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task18 {

    public static void main(String[] args) {
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti textul: ");
        text = scanner.next();
        System.out.println(validateEmail(text));

    }
    private static boolean sneezed(String text)
    {
        if(text.length() < 5)
        {
            return false;
        }
        StringBuilder compareString = new StringBuilder("ach");
        for(int i = 0; i < text.length() - 4; i++)
        {
            compareString.append("o");
        }
        compareString.append("!");
        return text.contentEquals(compareString);


    }

    private static boolean sneezed2(String text)
    {
        String regex = "^ach+o+!$";
        Pattern patterOfRegex = Pattern.compile(regex);
        Matcher matcher = patterOfRegex.matcher(text);
        return matcher.matches();
    }
    private static boolean validateEmail(String email)
    {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return email.matches(regex);
    }
}
